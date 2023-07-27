package Tests;

import Pages.HomePage;
import org.testng.annotations.Test;

public class ButtonsCheck extends BaseTest {
    HomePage HBO;

    @Test
    public void Check_Buttons()
    {
        HBO = new HomePage(driver);
        HBO.Check_All_Buttons();
    }

}
