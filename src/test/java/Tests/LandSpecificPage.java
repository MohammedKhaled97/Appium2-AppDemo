package Tests;

import io.appium.java_client.android.Activity;
import org.testng.annotations.Test;

public class LandSpecificPage extends BaseTest
{

    @Test
    public void SpeceficPage()
    {
        Activity activity = new Activity("io.appium.android.apis","io.appium.android.apis.ApiDemos");
        driver.startActivity(activity);
    }
}
