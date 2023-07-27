package Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class LongPressPage extends BasePage
{
    public LongPressPage(AndroidDriver driver) {
        super(driver);
    }



    @AndroidFindBy(accessibility = "Views")
    WebElement ViewsBTN;

    @AndroidFindBy(accessibility = "1. Custom Adapter")
    WebElement CustomAdapterBTN;

    @AndroidFindBy(accessibility = "Expandable Lists")
    WebElement ExpandablesBTN;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ExpandableListView/android.widget.TextView[1]")
    WebElement PeopleNameBTN;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.FrameLayout")
    WebElement SampleMenuBTN;

    public void Long_Press()
    {
        actions=new Actions(driver);
        ViewsBTN.click();
        ExpandablesBTN.click();
        CustomAdapterBTN.click();
        //LongPress*************************************
        actions.clickAndHold(PeopleNameBTN);
        actions.perform();
        Assert.assertTrue(SampleMenuBTN.isDisplayed());
        //**********************************************

    }


}
