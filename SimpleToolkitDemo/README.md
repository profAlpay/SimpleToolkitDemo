# SimpleToolkit Demo - .NET MAUI

A comprehensive demo application showcasing **SimpleToolkit** library for .NET MAUI with custom navigation, tab bar, and UI controls.

## Features

- Custom Tab Bar with SimpleShell - Fully customizable bottom navigation
- Smart Navigation - Tab bar automatically hides on detail pages  
- Icon Control - Tinted SVG icons with dynamic coloring
- ContentButton - Complex clickable layouts
- Dark Theme - Modern GitHub-inspired UI
- URI-based Navigation - Clean routing with Shell

## Libraries Used

- [SimpleToolkit.Core](https://www.nuget.org/packages/SimpleToolkit.Core)
- [SimpleToolkit.SimpleShell](https://www.nuget.org/packages/SimpleToolkit.SimpleShell)
- .NET MAUI (.NET 9.0)

## Project Structure

```
SimpleToolkitDemo/
├── Pages/
│   ├── HomePage.xaml
│   ├── ExplorePage.xaml
│   ├── ProfilePage.xaml
│   └── DetailPage.xaml
├── Controls/
│   └── CustomTabBar.xaml
├── Resources/Images/
│   ├── home.svg
│   ├── explore.svg
│   └── profile.svg
└── AppShell.xaml
```

## Setup

```csharp
// MauiProgram.cs
builder
    .UseSimpleToolkit()
    .UseSimpleShell()
```

## Custom Tab Bar Implementation

```xml
<simpleShell:SimpleShell.RootPageContainer>
    <Grid RowDefinitions="*, Auto">
        <simpleShell:SimpleNavigationHost Grid.Row="0" />
        <controls:CustomTabBar Grid.Row="1" />
    </Grid>
</simpleShell:SimpleShell.RootPageContainer>
```

## Navigation

```csharp
// Navigate to detail
await Shell.Current.GoToAsync(nameof(DetailPage));

// Go back
await Shell.Current.GoToAsync("..");
```

## Run the Project

1. Clone repository
2. Open in Visual Studio 2022
3. Restore NuGet packages
4. Select platform (Android/iOS/Windows)
5. Press F5

## Supported Platforms

- Android (API 21+)
- iOS (14.0+)
- macOS Catalyst
- Windows (10.0.19041.0+)

## Credits

- **SimpleToolkit** by [Radek Vymětalík](https://github.com/RadekVyM)
- Built with .NET MAUI

## License

MIT License