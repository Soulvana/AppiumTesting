import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class CommonUtils {

    private MobileDriver<MobileElement> driver;
    private String SERVER_URL = "http://127.0.0.1:4723/wd/hub";
    private static CommonUtils commonUtils;

    public static CommonUtils getInstance(Platform platform) {

        if (commonUtils == null) {
            commonUtils = new CommonUtils();

            try {
                if (platform == Platform.ANDROID) {
                    commonUtils.initAndroidConfig();
                }
            } catch (MalformedURLException ex) {

            }

        }
        return commonUtils;
    }

    public void initAndroidConfig() throws MalformedURLException {
        //Defining capabilities for test device
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "bd949afa0404"); //"R58M84ZBTXB"
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.mindvalley.soulvana");
        capabilities.setCapability("appActivity", ".newclean.update.presentation.AppUpdateActivity");

        driver = new AndroidDriver<>(new URL(SERVER_URL), capabilities);

    }

    public MobileElement getElement(String elementId) {
        try {
            return driver.findElementById(elementId);
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return null;
        }
    }

    public MobileElement getElementByXPath(String elementId) {

        try {
            return driver.findElementByXPath(elementId);

        } catch (org.openqa.selenium.NoSuchElementException e) {
            return null;
        }
    }

    public void clickOnXPathElement(String elementId) {
        Optional.ofNullable(getElementByXPath(elementId)).ifPresent(MobileElement::click);
    }

    public void clickOnElement(String elementId) {
        Optional.ofNullable(getElement(elementId)).ifPresent(MobileElement::click);
    }

    public void waitForSec(int timeInSec) {
        driver.manage().timeouts().implicitlyWait(timeInSec, TimeUnit.SECONDS);
    }

    public void setText(String elementId, String text) {
        Optional.ofNullable(getElement(elementId)).ifPresent(element -> element.sendKeys(text));
    }

    public void hideKeyboard() {
        driver.hideKeyboard();
    }

    public void tap(int xCoordinate, int yCoordinate) {
        (new TouchAction(driver)).tap(PointOption.point(xCoordinate, yCoordinate)).perform();
    }

    public void assertNotNull(String elementId, String errorMessage) {
        Assert.assertNotNull(getElement(elementId), errorMessage);
    }

    public void swipe(PointOption startPoint, PointOption endPoint) {
        try {
            new TouchAction(driver)
                    .press(startPoint)
                    .moveTo(endPoint)
                    .perform();
        } catch (InvalidElementStateException ex) {

        }

    }

    public void assertCorrectScreen(String screenName, String errorMessage) {

        if (driver instanceof AndroidDriver)
            Assert.assertEquals(((AndroidDriver) driver).currentActivity(), screenName, errorMessage);
    }

    public void closeApp() {
        driver.closeApp();
    }

    public void launchApp(){
        driver.launchApp();
    }

}
