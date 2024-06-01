package Core;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AppiumBase {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeTest
    public void setup() throws MalformedURLException {

        System.out.println("this is step: open app");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformVersion", "10.0");

        capabilities.setCapability("appPackage", "com.nct.shopiness");
        capabilities.setCapability("appActivity", ".ui.activities.intro.SplashActivity");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    public void teardown(){
        System.out.println("This is steps: teardown");
//        driver.close();
    }
}
