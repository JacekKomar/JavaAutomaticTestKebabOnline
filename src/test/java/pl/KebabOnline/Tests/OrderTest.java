package pl.KebabOnline.Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pl.KebabOnline.Pages.FoodPage;
import pl.KebabOnline.Pages.OrderPage;

public class OrderTest extends Main {
    Logger logger = Logger.getLogger(AddFoodToBasketTest.class.getName().getClass());
    @Test(priority = 1)
    public void basket(){

        OrderPage orderPage = new OrderPage(driver);
        orderPage.addTextToInput();
        logger.info("Dodano dane o osobie zamawiającej.");
    }


}
