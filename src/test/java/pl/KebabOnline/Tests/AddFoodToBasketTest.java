package pl.KebabOnline.Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pl.KebabOnline.Pages.FoodPage;
import pl.KebabOnline.Utils.Main;

public class AddFoodToBasketTest extends Main {




    public void foodButton(String label){
        driver.findElement(By.xpath("(//i[@class=\"bi bi-plus-square\"])" + label +"")).click();

    }



    @Test(priority = 1)
    public void addFoodToBasket() {
        FoodPage FoodPage = new FoodPage(driver);
        FoodPage.openKebabFoodPageClick();
        foodButton("[2]");

    }

    @Test(priority = 2)
    public void exitFoodPage(){
        FoodPage FoodPage = new FoodPage(driver);
        FoodPage.orderFoodButtonClick();
    }






}

