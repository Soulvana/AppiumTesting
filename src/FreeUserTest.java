import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Platform;

import java.net.MalformedURLException;

public class FreeUserTest extends BaseTest {


    @Override
    void startTest() {

        try {
            CommonUtils commonUtils = CommonUtils.getInstance(Platform.ANDROID);

            commonUtils.launchApp();

            commonUtils.waitForSec(10);

            commonUtils.clickOnElement("com.mindvalley.soulvana:id/com_appboy_inappmessage_full_button_dual_one");

            commonUtils.clickOnElement("com.mindvalley.soulvana:id/login_layout");

            commonUtils.setText("com.mindvalley.soulvana:id/login_edittext_email", "shrikant+testing@mindvalley.com");

            commonUtils.setText("com.mindvalley.soulvana:id/login_edittext_password", "qwerty");

            commonUtils.hideKeyboard();

            commonUtils.clickOnElement("com.mindvalley.soulvana:id/login_button_layout");

            commonUtils.waitForSec(20);

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

            commonUtils.assertNotNull("com.mindvalley.soulvana:id/iv_author_img", "Session in progress not started");

        } catch (Exception ex) {

        }
    }
}
