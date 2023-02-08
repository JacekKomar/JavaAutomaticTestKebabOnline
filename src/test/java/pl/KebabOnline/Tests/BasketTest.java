package pl.KebabOnline.Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pl.KebabOnline.Pages.BasketPage;
import pl.KebabOnline.Pages.DrinksPage;

public class BasketTest extends Main {
    Logger logger = Logger.getLogger(AddFoodToBasketTest.class.getName().getClass());
    public void inBasketAddButton(String label) {

        driver.findElement(By.xpath("(//i[@class=\"bi bi-plus-square\"])" + label + "")).click();

    }

    public void inBasketDashButton(String label) {

        driver.findElement(By.xpath("(//i[@class=\"bi bi-dash-square\"])" + label + "")).click();
    }

        public void inBasketDeleteItemButton(String label) {

            driver.findElement(By.xpath("(//i[@class=\"bi bi-x-lg\"])" + label + "")).click();

        }

        @Test(priority = 1)
        public void changeItemsInBasket(){
            BasketPage basketPage = new BasketPage(driver);
            basketPage.BasketPageOpen();
            inBasketDeleteItemButton("[5]");
            inBasketAddButton("[1]");
            inBasketAddButton("[3]");
            inBasketAddButton("[4]");
            inBasketAddButton("[1]");
            inBasketDashButton("[2]");
            logger.info("Zmiana ilości przedmiotów w koszyku.");
        }


        @Test(priority = 2)
        public void goToOrder(){
            BasketPage basketPage = new BasketPage(driver);
            basketPage.OrderPage();
            logger.info("Złożono zamówienie.");
        }

}
