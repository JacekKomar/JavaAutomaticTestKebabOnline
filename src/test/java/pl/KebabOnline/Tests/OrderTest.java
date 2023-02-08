package pl.KebabOnline.Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pl.KebabOnline.Pages.FoodPage;
import pl.KebabOnline.Pages.OrderPage;

public class OrderTest extends Main {

    @Test(priority = 1)
    public void basket(){
        OrderPage orderPage = new OrderPage(driver);
        orderPage.addTextToInput();
    }


}
