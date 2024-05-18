// Flutter - Same button creation code on client-side for Android and iOS
// This class can be interface as well, but is not because of createUIComponentFactory(String platform), so that if from client platform is entered then you should that platforms object only

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

     public UIComponentFactory createUIComponentFactory(){
        return null;
    }
}
