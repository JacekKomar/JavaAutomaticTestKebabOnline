package pl.KebabOnline.Tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pl.KebabOnline.Pages.DrinksPage;

public class AddDrinksToBasketTest extends Main {

        public void drinksAddButton(String label){
            driver.findElement(By.xpath("(//i[@class=\"bi bi-plus-square\"])" + label +"")).click();

        }
        public void drinksDeleteButton(String label){
            driver.findElement(By.xpath("(//i[@class=\"bi bi-dash-square\"])" + label +"")).click();

        }

        @Test(priority = 1)
        public void addDrinksToBasket() {
            DrinksPage DrinksPage = new DrinksPage(driver);
            DrinksPage.openDrinksPageClick();

            Alert alert = driver.switchTo().alert();
            driver.switchTo().alert().sendKeys("22");
            alert.accept();

            drinksAddButton("[1]");
            drinksAddButton("[2]");
            drinksAddButton("[3]");
            drinksAddButton("[4]");
            drinksAddButton("[5]");
            drinksAddButton("[6]");
            drinksAddButton("[7]");
            drinksAddButton("[8]");
            drinksAddButton("[9]");
            drinksAddButton("[10]");
            drinksAddButton("[10]");
            drinksAddButton("[11]");
            drinksAddButton("[12]");
            drinksAddButton("[12]");
        }

        @Test(priority = 2)
        public void deleteDrinks(){
            drinksDeleteButton("[1]");
            drinksDeleteButton("[2]");
            drinksDeleteButton("[3]");
            drinksDeleteButton("[4]");
            drinksDeleteButton("[5]");
            drinksDeleteButton("[6]");
            drinksDeleteButton("[7]");
            drinksDeleteButton("[8]");
            drinksDeleteButton("[9]");
            drinksDeleteButton("[10]");
            drinksDeleteButton("[11]");
            drinksDeleteButton("[12]");

        }

        @Test(priority = 3)
        public void exitDrinksPage(){
            DrinksPage DrinksPage = new DrinksPage(driver);
            DrinksPage.orderDrinksButtonClick();
        }




    }

