import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Platform;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class GuestUserTest {

    public static void main(String[] args) throws MalformedURLException {

        CommonUtils commonUtils = CommonUtils.getInstance(Platform.ANDROID);

        commonUtils.waitForSec(10);

        commonUtils.clickOnElement("com.mindvalley.soulvana:id/tv_get_started");

        commonUtils.clickOnElement("com.mindvalley.soulvana:id/plans_tab_button");

        commonUtils.clickOnXPathElement("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup");

        commonUtils.waitForSec(10);

        commonUtils.swipe(PointOption.point(462, 1702),
                PointOption.point(494, 837));

        commonUtils.clickOnXPathElement("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/android.widget.TextView[5]");

        commonUtils.clickOnElement("com.mindvalley.soulvana:id/start_session");

        commonUtils.assertNotNull("com.mindvalley.soulvana:id/signup_text_title", "Signup screen is not showing");
    }


}
