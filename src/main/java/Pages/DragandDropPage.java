package Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class DragandDropPage extends BasePage
{
    public DragandDropPage(AndroidDriver driver) {
        super(driver);
    }
    @AndroidFindBy(accessibility = "Views")
    WebElement ViewsBTN;

    @AndroidFindBy(accessibility = "Drag and Drop")
    WebElement DragBTN;

    @AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_1")
    WebElement SourceELE;


    public void Drag()
    {
        ViewsBTN.click();
        DragBTN.click();
        //Drag************
        DragFunc(SourceELE,709,674);
        String DragResult = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
        //Assert that Drag Happened
        Assert.assertEquals(DragResult,"Dropped!");
    }

}
