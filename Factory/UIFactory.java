// Practical Factory - Different terms used at different places
// Using Singleton + Registry can remove if-else conditions (Create 1-1 object of AndroidUIComponentFactory, IOSUIComponentFactory and save it to the registry. Then whenever you need it, call the registry using platform and get the object

package Factory;

import Factory.AndroidUIComponentFactory;
import Factory.IOSUIComponentFactory;
import Factory.UIComponentFactory;

public class UIFactory {
    public static UIComponentFactory getUIComponentFactoryByPlatform(String platform){
        if(platform.equals("Android"))
            return new AndroidUIComponentFactory();
        else if (platform.equals("IOS"))
            return new IOSUIComponentFactory();

        return null;
    }
}
