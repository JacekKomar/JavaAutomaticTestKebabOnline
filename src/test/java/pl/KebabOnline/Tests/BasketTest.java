package pl.KebabOnline.Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pl.KebabOnline.Pages.BasketPage;
import pl.KebabOnline.Pages.DrinksPage;

public class BasketTest extends Main {

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
            basketPage.BasketPage();
            inBasketDeleteItemButton("[5]");
            inBasketAddButton("[1]");
            inBasketAddButton("[3]");
            inBasketAddButton("[4]");
            inBasketAddButton("[1]");
            inBasketDashButton("[2]");
        }


        @Test(priority = 2)
        public void goToOrder(){
            BasketPage basketPage = new BasketPage(driver);
            basketPage.OrderPage();
        }

}
