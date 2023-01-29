import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FuctionalityTest {

    static AppiumDriver<MobileElement> driver;
    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "192.168.85.105:5555");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"); //platformName
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9"); //platformVersion
        cap.setCapability(MobileCapabilityType.UDID, "192.168.85.105:5555");

        cap.setCapability("appPackage", "com.android.gallery3d");
        cap.setCapability("appActivity","com.android.gallery3d.app.GalleryActivity");

        AppiumDriver<MobileElement> driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        TouchAction touchAction = new TouchAction(driver);


        driver.findElementById("android:id/text1").click();
        System.out.println(driver.findElementById("android:id/text1").getText());


      /*


        String[] numpad = {
                "com.android.calculator2:id/digit_4",
                "com.android.calculator2:id/op_mul",
                "com.android.calculator2:id/digit_5",
                "com.android.calculator2:id/eq"};


        for(int i=0;i<numpad.length;i++)
            touchAction.tap(TapOptions.tapOptions()
                            .withElement(ElementOption.element(driver.findElement(By
                                    .id(numpad[i])))))
                    .perform();

        assertEquals("Not true result","20",driver.findElementById("com.android.calculator2:id/result").getText());

*/

        driver.closeApp();
    }
}
