package pl.KebabOnline.Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

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

        @Test
    public void changeItemsInBasket(){



        }


}