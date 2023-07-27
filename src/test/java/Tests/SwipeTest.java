package Tests;

import Pages.SwipePage;
import org.testng.annotations.Test;

public class SwipeTest extends BaseTest
{
    SwipePage SO;


    @Test
    public void Swipe()
    {
        SO = new SwipePage(driver);
        SO.Swipe();

    }
}
