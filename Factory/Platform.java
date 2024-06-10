// Flutter - Same button creation code on client-side for Android and iOS
// Factory method - createUIComponentFactory()
// Make Factory interface when client uses this implementation:
//      Platform p = new Android();
//      UIComponentFactory uiComponentFactory = p.createUIComponentFactory();
// Make Factory abstract class/normal class when client uses this implementation:
//      Platform p1 = new Platform();
//      UIComponentFactory uiComponentFactory1 = p.createUIComponentFactory("Android");

package Factory;

public class Platform {
    public void setRefreshRate(){
        System.out.println("REFRESH RATE UPDATED");
    }

    public void setTheme(){
        System.out.println("THEME UPDATED");
    }

    public UIComponentFactory createUIComponentFactory(String platform){    // Factory method
        return UIFactory.getUIComponentFactoryByPlatform(platform);
    }

/* if (platform.equals("Android"))
        return new AndroidUIComponentFactory();
else if (platform.equals("IOS"))
        return new IOSUIComponentFactory(); */

    public UIComponentFactory createUIComponentFactory(){
        return null;
    }
}
