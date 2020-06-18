import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Platform;

public class GuestUserTest extends BaseTest {


    @Override
    void startTest() {

        CommonUtils commonUtils = CommonUtils.getInstance(Platform.ANDROID);
        try {

            commonUtils.waitForSec(10);

            commonUtils.clickOnElement("com.mindvalley.soulvana:id/com_appboy_inappmessage_full_button_dual_one");

            commonUtils.clickOnElement("com.mindvalley.soulvana:id/tv_get_started");

            commonUtils.waitForSec(10);

            commonUtils.clickOnElement("com.mindvalley.soulvana:id/plans_tab_button");

            commonUtils.clickOnXPathElement("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup");

            commonUtils.waitForSec(10);

            commonUtils.swipe(PointOption.point(462, 1702),
                    PointOption.point(494, 837));

            commonUtils.clickOnXPathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/android.widget.TextView[5]");

            commonUtils.clickOnElement("com.mindvalley.soulvana:id/start_session");

            commonUtils.assertCorrectScreen(".launcher.SignupActivity", "Signup screen is not showing");

            commonUtils.closeApp();
        } catch (Exception ex) {
        }

    }
}
