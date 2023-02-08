package pl.KebabOnline.Tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pl.KebabOnline.Pages.FoodPage;


public class AddFoodToBasketTest extends Main {

    Logger logger = Logger.getLogger(AddFoodToBasketTest.class.getName().getClass());

    public void foodAddButton(String label){
        driver.findElement(By.xpath("(//i[@class=\"bi bi-plus-square\"])" + label +"")).click();

    }
    public void foodDeleteButton(String label){
        driver.findElement(By.xpath("(//i[@class=\"bi bi-dash-square\"])" + label +"")).click();

    }

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

}