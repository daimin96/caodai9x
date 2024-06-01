package Functions;

import Core.AppiumBase;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;



public class common extends AppiumBase {

    private static AndroidDriver driver;
    String productName;

    String productPrice;

    public void clickToElement(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.click();

    }

    public void sendKeys(By locator, String value) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(value);
    }

    public boolean isdisplayed(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.isDisplayed();
        return false;
    }

    public String getText(By by) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        String text = element.getText();
        return text;
    }
    public int converStrToInt(String text){
        int number = Integer.parseInt(text);
        return number;
    }

    public void verifyEquals(String actual, By expected) {

        Assert.assertEquals(actual, expected);
    }

    // scroll - hàm  cuộn
    public void checkScroll(By locator, int startx, int starty, int endx, int endy) throws IOException {
        for (int i = 1; i <= 100; i++) {
            if (driver.findElements(locator).size() != 0) {
                // If element is displayed then click on it
                System.out.println("Tab " + (i + 1) + " has been found and now clicking on it.");
                // capturing Screenshots
                capturingScreenshots("");
                // click to element
                driver.findElement(locator).click();
                break;
            } else {
                // If element is not displayed then continues scroll by swipe menthod
                swipe(startx, starty, endx, endy);
            }
        }
    }

    //Hàm cuộn 1 nửa
    public void checkScrollToElement(By locator) throws IOException {
        for (int i = 1; i <= 100; i++) {
            if (driver.findElements(locator).size() != 0) {
                // If element is displayed then click on it
                System.out.println("Tab " + (i + 1) + " has been found and now clicking on it.");
                // capturing Screenshots
                capturingScreenshots("");
                // click to element
                driver.findElement(locator).click();
                break;
            } else {
                // If element is not displayed then continues scroll by swipe menthod
                Dimension size = driver.manage().window().getSize();
                int starty = (int) (size.height * 0.8);
                int endy = (int) (size.height * 0.2);
                int startx = size.width / 2;
                swipe(startx, starty, startx, endy);
            }
        }
    }

    // tab to element
    public void tapByElement(By locator) {
        TouchAction action = new TouchAction(driver);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        action.tap(TapOptions.tapOptions().withElement(ElementOption.element(element))).perform();
    }

    //tapByCoordinates
    public void tapByCoordinates(int x, int y) {
        TouchAction action = new TouchAction(driver);
        action.tap(PointOption.point(x, y));
    }


    //tapByCoordinates
    public void longPress(int x, int y) {
        TouchAction action = new TouchAction(driver);
        action.longPress(PointOption.point(x, y));
    }

    //swipe == vuot
    public void swipe(int startx, int starty, int endx, int endy) {
        new TouchAction(driver).longPress(PointOption.point(startx, starty))
                .moveTo(PointOption.point(endx, endy))
                .release().perform();

    }

    public void swipeMobileUp() {
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.8);
        int endy = (int) (size.height * 0.2);
        int startx = size.width / 2;
        swipe(startx, starty, startx, endy);

    }

    public void swipeMobileDown() {
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.8);
        int endy = (int) (size.height * 0.2);
        int startx = size.width / 2;
        swipe(startx, endy, startx, starty);

    }

    public void rightLeftSwipe() {
        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.90);
        int endx = (int) (size.width * 0.10);
        int starty = size.height / 2;
        swipe(startx, starty, endx, starty);

    }

    public void leftRightSwipe() {
        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.90);
        int endx = (int) (size.width * 0.10);
        int starty = size.height / 2;
        swipe(endx, starty, startx, starty);


    }

    //Capturing screenshots
    public void capturingScreenshots(String name) throws IOException {
        File screenShot = driver.getScreenshotAs(OutputType.FILE);
        File location = new File("screenshots");
        String screenShotName = location.getAbsolutePath() + File.separator + name;
        FileUtils.copyFile(screenShot, new File(screenShotName));

    }

    public void removeApp() {
        driver.currentActivity();
    }
}
