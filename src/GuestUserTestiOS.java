import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Platform;

public class GuestUserTestiOS extends BaseTest {


    @Override
    void startTest() {

        CommonUtils commonUtils = CommonUtils.getInstance(Platform.IOS);
        try {

            commonUtils.waitForSec(10);

//            MobileElement el1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Start Free Today\"]");
//            el1.click();
//            MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("iconNextGreen");
//            el2.click();
//            MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("iconNextGreen");
//            el3.click();
//            MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("iconNextGreen");
//            el4.click();

//            (new TouchAction(driver)).tap(122, 833).perform()

            commonUtils.closeApp();
        } catch (Exception ex) {
        }

    }
}
