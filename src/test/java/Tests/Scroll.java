package Tests;

import Pages.ScrollPage;
import org.testng.annotations.Test;

public class Scroll extends BaseTest
{
    ScrollPage SC ;


    @Test
    public void ScrollToElement()
    {
        SC = new ScrollPage(driver);
        SC.Scroll();
    }
}
