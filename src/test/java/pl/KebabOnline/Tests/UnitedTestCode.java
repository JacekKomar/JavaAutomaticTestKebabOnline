package pl.KebabOnline.Tests;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import pl.KebabOnline.Pages.BasketPage;
import pl.KebabOnline.Pages.DrinksPage;
import pl.KebabOnline.Pages.FoodPage;
import pl.KebabOnline.Pages.OrderPage;
import java.util.logging.Logger;

public class UnitedTestCode extends Main {

    java.util.logging.Logger logger = Logger.getLogger(UnitedTestCode.class.getName());

    @Test(priority = 1)
    public void addFoodToBasket() {
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
        logger.info("Dodano dania do koszyka.");
    }

    @Test(priority = 2)
    public void deleteFood(){
        foodDeleteButton("[1]");
        foodDeleteButton("[2]");
        foodDeleteButton("[3]");
        foodDeleteButton("[4]");
        foodDeleteButton("[5]");
        foodDeleteButton("[6]");
        foodDeleteButton("[7]");
        foodDeleteButton("[8]");
        foodDeleteButton("[9]");
        logger.info("Usunięto dania z koszyka.");
    }

    @Test(priority = 3)
    public void exitFoodPage(){
        FoodPage foodPage = new FoodPage(driver);
        foodPage.orderFoodButtonClick();
        logger.info("Przejście do koszyka.");
    }

    @Test(priority = 4)
    public void addDrinksToBasket() throws InterruptedException {
        DrinksPage DrinksPage = new DrinksPage(driver);
        DrinksPage.openDrinksPageClick();
        Alert alert = driver.switchTo().alert();
        driver.switchTo().alert().sendKeys("22");
        alert.accept();
        Thread.sleep(2000);
        alert.accept();
        logger.info("Wpisano wiek klienta.");
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
        logger.info("Dodano napoje do koszyka.");
    }

    @Test(priority = 5)
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
        logger.info("Usunięto napoje z koszyka.");
    }

    @Test(priority = 6)
    public void exitDrinksPage(){
        DrinksPage DrinksPage = new DrinksPage(driver);
        DrinksPage.orderDrinksButtonClick();
        logger.info("Przejście do koszyka.");
    }

    @Test(priority = 7)
    public void changeItemsInBasket() throws InterruptedException {
        Thread.sleep(2000);
        inBasketDeleteItemButton("[5]");
        inBasketAddButton("[1]");
        inBasketAddButton("[3]");
        inBasketAddButton("[4]");
        inBasketAddButton("[1]");
        inBasketDashButton("[2]");
        logger.info("Zmiana ilości przedmiotów w koszyku.");
    }

    @Test(priority = 8)
    public void goToOrder(){
        BasketPage basketPage = new BasketPage(driver);
        basketPage.OrderPage();
        logger.info("Złożono zamówienie.");
    }

    @Test(priority = 9)
    public void basket(){
        OrderPage orderPage = new OrderPage(driver);
        orderPage.addTextToInput();
        logger.info("Dodano dane o osobie zamawiającej.");
    }
}
