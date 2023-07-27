package Tests;

import Pages.DragandDropPage;
import org.testng.annotations.Test;

public class DragAndDropTest extends BaseTest
{
    DragandDropPage DO;


    @Test
    public void Drag_Drop()
    {
        DO = new DragandDropPage(driver);
        DO.Drag();
    }
}
