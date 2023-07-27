package Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.Alert;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AlertPage extends BasePage
{
    public AlertPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "App")
    WebElement AppBTN;

    @AndroidFindBy(accessibility = "Alert Dialogs")
    WebElement AlertBTN;

    @AndroidFindBy(accessibility = "OK Cancel dialog with a message")
    WebElement FirstAlertBTN;

    @AndroidFindBy(accessibility = "Text Entry dialog")
    WebElement TextBox;


    public void Igonre_Alert() throws InterruptedException {
        AppBTN.click();
        AlertBTN.click();
        FirstAlertBTN.click();
        //Handle Alert*****************************************************
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)) ;
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert =  driver.switchTo().alert();
        //Assert***********************************************************
        String AlertText =  alert.getText();
        Assert.assertEquals(AlertText,"Lorem ipsum dolor sit aie consectetur adipiscing\n" +
                "Plloaso mako nuto siwuf cakso dodtos anr koop.");
        alert.dismiss();

    }

    public void Enter_Text_Alert()
    {
        TextBox.click();
        //Handle Alert*****************************************************
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)) ;
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert =  driver.switchTo().alert();
        WebElement Name = driver.findElement(AppiumBy.id("io.appium.android.apis:id/username_edit"));
        WebElement password = driver.findElement(AppiumBy.id("io.appium.android.apis:id/password_edit"));
        Name.sendKeys("Test");
        password.sendKeys("Pass");
        //Assertion*******************************************************
        String AlertText =  alert.getText();
        Assert.assertTrue(AlertText.contains("Text Entry dialog"));
        alert.accept();
    }
}
