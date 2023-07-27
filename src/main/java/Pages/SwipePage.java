package Pages;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;

public class SwipePage extends BasePage
{

    public SwipePage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "Views")
    WebElement ViewsBTN;

    @AndroidFindBy(accessibility = "Gallery")
    WebElement GalleryBTN;

    @AndroidFindBy(accessibility = "1. Photos")
    WebElement FirstPhotosBTN;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Gallery/android.widget.ImageView[1]")
    WebElement IntialElement;


    public void Swipe()
    {
        ViewsBTN.click();
        GalleryBTN.click();
        FirstPhotosBTN.click();
        //Check The First Element is Active / Focused
        Assert.assertEquals( IntialElement.getAttribute("focusable"),"true");
        //Apply Swipe So First element is not Focused and the second is
        Swipe(IntialElement,"left");
        Assert.assertEquals( IntialElement.getAttribute("focusable"),"false");


    }

}
