package Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ScrollPage extends BasePage
{
    public ScrollPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "Views")
    WebElement ViewsBTN;

    @AndroidFindBy(accessibility = "WebView3")
    WebElement WebView3BTN;


    public void Scroll()
    {
        ViewsBTN.click();
        //Rotation****************************************************
        DeviceRotation LandScape = new DeviceRotation(0,0,90);
        driver.rotate(LandScape);
        //Scroll Till Element*********************
        driver.findElement(AppiumBy.androidUIAutomator(("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView3\"));")));
        //Assertion****************************************
        Assert.assertTrue(WebView3BTN.isDisplayed());
        //************************************************
    }
}
