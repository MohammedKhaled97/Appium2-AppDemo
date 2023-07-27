package Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class HomePage extends BasePage
{
    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "Access'ibility")
    WebElement AccessBTN;

    @AndroidFindBy(accessibility = "Accessibility")
    WebElement AccessibilityBTN;

    @AndroidFindBy(accessibility = "Animation")
    WebElement AnimationBTN;

    @AndroidFindBy(accessibility = "App")
    WebElement AppBTN;

    @AndroidFindBy(accessibility = "Content")
    WebElement ContentBTN;

    @AndroidFindBy(accessibility = "Graphics")
    WebElement GraphicsBTN;

    @AndroidFindBy(accessibility = "Media")
    WebElement MediaBTN;

    @AndroidFindBy(accessibility = "NFC")
    WebElement NFCBTN;

    @AndroidFindBy(accessibility = "OS")
    WebElement OSBTN;

    @AndroidFindBy(accessibility = "Preference")
    WebElement PreferenceBTN;

    @AndroidFindBy(accessibility = "Text")
    WebElement TextBTN;

    @AndroidFindBy(accessibility = "Views")
    WebElement ViewsBTN;

    String CurrentActivity1 = ".ApiDemos";

    public void Check_All_Buttons()
    {
        AccessBTN.click();
        Assert.assertEquals(driver.currentActivity(),CurrentActivity1);
        driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));

        AccessibilityBTN.click();
        Assert.assertEquals(driver.currentActivity(),CurrentActivity1);
        driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));

        AnimationBTN.click();
        Assert.assertEquals(driver.currentActivity(),CurrentActivity1);
        driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));

        AppBTN.click();
        Assert.assertEquals(driver.currentActivity(),CurrentActivity1);
        driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));

        ContentBTN.click();
        Assert.assertEquals(driver.currentActivity(),CurrentActivity1);
        driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));

        GraphicsBTN.click();
        Assert.assertEquals(driver.currentActivity(),CurrentActivity1);
        driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));

        MediaBTN.click();
        Assert.assertEquals(driver.currentActivity(),CurrentActivity1);
        driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));

        NFCBTN.click();
        Assert.assertEquals(driver.currentActivity(),CurrentActivity1);
        driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));

        OSBTN.click();
        Assert.assertEquals(driver.currentActivity(),CurrentActivity1);
        driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));

        PreferenceBTN.click();
        Assert.assertEquals(driver.currentActivity(),CurrentActivity1);
        driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));

        TextBTN.click();
        Assert.assertEquals(driver.currentActivity(),CurrentActivity1);
        driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));

        ViewsBTN.click();
        Assert.assertEquals(driver.currentActivity(),CurrentActivity1);
        driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
    }


}
