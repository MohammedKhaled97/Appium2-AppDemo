package Tests;

import Pages.AlertPage;
import org.testng.annotations.Test;

public class AlertsTest extends BaseTest {
    AlertPage AO;

    @Test(priority = 0)
    public void Alert_Dismiss() throws InterruptedException {
        AO = new AlertPage(driver);
        AO.Igonre_Alert();
    }


    @Test(priority = 1)
    public void Enter_Text_Alert()
    {
        AO = new AlertPage(driver);
        AO.Enter_Text_Alert();
    }

}
