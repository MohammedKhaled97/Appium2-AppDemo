package Tests;

import Pages.LongPressPage;
import org.testng.annotations.Test;

public class LongPress extends BaseTest
{
    LongPressPage LPO;

    @Test
    public void Long_Press()
    {
        LPO= new LongPressPage(driver);
        LPO.Long_Press();
    }
}
