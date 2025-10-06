using SimpleToolkit.SimpleShell;

namespace SimpleToolkitDemo;

public partial class AppShell : SimpleShell
{
    public AppShell()
    {
        InitializeComponent();

        // Register routes for detail pages
        Routing.RegisterRoute(nameof(Pages.DetailPage), typeof(Pages.DetailPage));
    }
}