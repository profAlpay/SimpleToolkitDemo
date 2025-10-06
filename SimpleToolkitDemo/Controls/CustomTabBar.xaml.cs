using SimpleToolkit.Core;
using Microsoft.Maui.Controls.Shapes;

namespace SimpleToolkitDemo.Controls;

public partial class CustomTabBar : ContentView
{
    private bool _isInitialized = false;

    public CustomTabBar()
    {
        InitializeComponent();
        Loaded += OnLoaded;
    }

    private void OnLoaded(object sender, EventArgs e)
    {
        if (!_isInitialized)
        {
            CreateTabButtons();
            _isInitialized = true;
        }
    }

    private void CreateTabButtons()
    {
        tabBarContainer.Children.Clear(); // Önce temizle

        var shell = Shell.Current;
        if (shell == null) return;

        var shellContents = shell.Items.SelectMany(i => i.Items).SelectMany(s => s.Items).ToList();

        foreach (var shellContent in shellContents)
        {
            var tabButton = CreateTabButton(shellContent);
            tabBarContainer.Children.Add(tabButton);
        }
    }

    private View CreateTabButton(ShellContent shellContent)
    {
        var border = new Border
        {
            BackgroundColor = Colors.Transparent,
            StrokeThickness = 0,
            Padding = new Thickness(20, 10),
            StrokeShape = new RoundRectangle { CornerRadius = 12 }
        };

        var button = new ContentButton
        {
            BackgroundColor = Colors.Transparent,
            Padding = 0
        };

        var grid = new Grid
        {
            RowDefinitions =
            {
                new RowDefinition { Height = GridLength.Auto },
                new RowDefinition { Height = GridLength.Auto }
            },
            RowSpacing = 4
        };

        var icon = new Icon
        {
            Source = shellContent.Icon,
            TintColor = Color.FromArgb("#8b949e"),
            HeightRequest = 24,
            WidthRequest = 24,
            HorizontalOptions = LayoutOptions.Center
        };

        var label = new Label
        {
            Text = shellContent.Title,
            FontSize = 12,
            TextColor = Color.FromArgb("#8b949e"),
            HorizontalOptions = LayoutOptions.Center
        };

        grid.Add(icon, 0, 0);
        grid.Add(label, 0, 1);

        button.Content = grid;
        button.Clicked += async (s, e) => await OnTabClicked(shellContent, icon, label, border);

        border.Content = button;

        if (Shell.Current.CurrentState.Location.OriginalString.Contains(shellContent.Route))
        {
            UpdateTabAppearance(icon, label, border, true);
        }

        return border;
    }

    private async Task OnTabClicked(ShellContent shellContent, Icon icon, Label label, Border border)
    {
        var shell = Shell.Current;
        if (!shell.CurrentState.Location.OriginalString.Contains(shellContent.Route))
        {
            ResetAllTabs();
            UpdateTabAppearance(icon, label, border, true);
            await shell.GoToAsync($"///{shellContent.Route}");
        }
    }

    private void ResetAllTabs()
    {
        foreach (var child in tabBarContainer.Children)
        {
            if (child is Border border && border.Content is ContentButton btn && btn.Content is Grid grid)
            {
                var icon = grid.Children[0] as Icon;
                var label = grid.Children[1] as Label;
                UpdateTabAppearance(icon, label, border, false);
            }
        }
    }

    private void UpdateTabAppearance(Icon icon, Label label, Border border, bool isActive)
    {
        var activeColor = Color.FromArgb("#58a6ff");
        var inactiveColor = Color.FromArgb("#8b949e");

        icon.TintColor = isActive ? activeColor : inactiveColor;
        label.TextColor = isActive ? activeColor : inactiveColor;
        border.BackgroundColor = isActive ? Color.FromArgb("#1f6feb").WithAlpha(0.2f) : Colors.Transparent;
    }
}