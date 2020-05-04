import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Platform;
import org.testng.annotations.BeforeTest;

public class FreeUserTestiOS extends BaseTest {

    @BeforeTest
    void clearData(){

    }

    @Override
    void startTest() {

        try {
            CommonUtils commonUtils = CommonUtils.getInstance(Platform.IOS);

//            commonUtils.launchApp();

            commonUtils.waitForSec(20);

//            MobileElement el1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Login with Mindvalley\"]");
//            el1.click();
            commonUtils.clickOnXPathElement("//XCUIElementTypeButton[@name=\"Login with Mindvalley\"]");
//
//
            commonUtils.setTextOnXPathElement("//XCUIElementTypeApplication[@name=\"Soulvana\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField", "shrikant+testing@mindvalley.com");
//
            commonUtils.setTextOnXPathElement("//XCUIElementTypeApplication[@name=\"Soulvana\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeSecureTextField", "qwerty");
//
            commonUtils.hideKeyboard();
//
            commonUtils.clickOnXPathElement("//XCUIElementTypeButton[@name=\"Log in with Mindvalley\"]");

            commonUtils.waitForSec(30);
            System.out.println("Waiting finished");
            commonUtils.tap(371, 70);
            System.out.println("Clicked on given cordinate");

           /* commonUtils.waitForSec(20);

            commonUtils.tap(906, 1785);

            commonUtils.tap(902, 1812);

            commonUtils.tap(897, 1803);

            commonUtils.assertNotNull("com.mindvalley.soulvana:id/tv_user_name", "Not showing upgrade prompt");

            commonUtils.clickOnElement("com.mindvalley.soulvana:id/txt_referral_skip");

            commonUtils.clickOnElement("com.mindvalley.soulvana:id/plans_tab_button");

            commonUtils.clickOnXPathElement("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup");

            commonUtils.waitForSec(10);

            commonUtils.swipe(PointOption.point(426, 2137), PointOption.point(435, 572));

            commonUtils.clickOnElement("com.mindvalley.soulvana:id/start_session");

            commonUtils.assertCorrectScreen(".launcher.SignupActivity", "Signup screen is not showing");

            commonUtils.assertNotNull("com.mindvalley.soulvana:id/iv_author_img", "Session in progress not started"); */

        } catch (Exception ex) {

        }
    }
}
