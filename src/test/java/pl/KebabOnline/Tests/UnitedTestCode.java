package pl.KebabOnline.Tests;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import pl.KebabOnline.Pages.BasketPage;
import pl.KebabOnline.Pages.DrinksPage;
import pl.KebabOnline.Pages.FoodPage;
import pl.KebabOnline.Pages.OrderPage;

public class UnitedTestCode extends Main {

    @Test(priority = 1)
    public void testAddFoodToBasket() {
        FoodPage foodPage = new FoodPage(driver);
        foodPage.openKebabFoodPageClick();
        foodAddButton("[2]");
        foodAddButton("[2]");
        foodAddButton("[1]");
        foodAddButton("[3]");
        foodAddButton("[9]");
        foodAddButton("[5]");
        foodAddButton("[6]");
        foodAddButton("[8]");
        foodAddButton("[7]");
        foodAddButton("[4]");
        foodAddButton("[9]");
        foodAddButton("[1]");
        foodAddButton("[2]");
    }

    @Test(priority = 2)
    public void testDeleteFoodFromFoodPage(){
        foodDeleteButton("[1]");
        foodDeleteButton("[2]");
        foodDeleteButton("[3]");
        foodDeleteButton("[4]");
        foodDeleteButton("[5]");
        foodDeleteButton("[6]");
        foodDeleteButton("[7]");
        foodDeleteButton("[8]");
        foodDeleteButton("[9]");
    }

    @Test(priority = 3)
    public void testExitFoodPage(){
        FoodPage foodPage = new FoodPage(driver);
        foodPage.orderFoodButtonClick();
    }

    @Test(priority = 4)
    public void testAddDrinksToBasket() throws InterruptedException {
        DrinksPage DrinksPage = new DrinksPage(driver);
        DrinksPage.openDrinksPageClick();
        Alert alert = driver.switchTo().alert();
        driver.switchTo().alert().sendKeys("22");
        alert.accept();
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
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

    @Test(priority = 5)
    public void testDeleteDrinksFromDrinksPage(){
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

    @Test(priority = 6)
    public void testExitDrinksPage(){
        DrinksPage DrinksPage = new DrinksPage(driver);
        DrinksPage.orderDrinksButtonClick();
    }

    @Test(priority = 7)
    public void testChangeItemsInBasket() throws InterruptedException {
        Thread.sleep(2000);
        inBasketDeleteItemButton("[5]");
        inBasketAddButton("[1]");
        inBasketAddButton("[3]");
        inBasketAddButton("[4]");
        inBasketAddButton("[1]");
        inBasketDashButton("[2]");
    }

    @Test(priority = 8)
    public void testOfBasketAndOrderPage(){
        OrderPage orderPage = new OrderPage(driver);
        BasketPage basketPage = new BasketPage(driver);
        basketPage.OrderPage();
        orderPage.addTextToInput();
    }

}
