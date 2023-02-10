package pl.KebabOnline.Tests;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pl.KebabOnline.Pages.BasketPage;
import pl.KebabOnline.Pages.DrinksPage;
import pl.KebabOnline.Pages.FoodPage;
import pl.KebabOnline.Pages.OrderPage;

public class UnitedTestCode extends Main {
    static ExtentTest test;
    static ExtentReports report;

    @BeforeTest
    public static void startTest()
    {
        report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
        test = report.startTest("KebabOnlineTest");
    }


    @Test(priority = 1)
    public void testAddAndDeleteFoodsInBasket() {
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

    @Test(priority = 2)
    public void testExitFoodPage(){
        FoodPage foodPage = new FoodPage(driver);
        foodPage.orderFoodButtonClick();
    }

    @Test(priority = 3)
    public void testAddAndDeleteDrinksInBasket() throws InterruptedException {
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
        DrinksPage.drinksPageInfo();
    }

    @Test(priority = 4)
    public void testChangeItemsInBasket() throws InterruptedException {
        DrinksPage DrinksPage = new DrinksPage(driver);
        BasketPage basketPage = new BasketPage(driver);
        DrinksPage.orderDrinksButtonClick();
        Thread.sleep(2000);
        basketPage.OpenBasketPage();
        inBasketDeleteItemButton("[5]");
        inBasketAddButton("[1]");
        inBasketAddButton("[3]");
        inBasketAddButton("[4]");
        inBasketAddButton("[1]");
        inBasketDashButton("[2]");
    }

    @Test(priority = 5)
    public void testOfBasketAndOrderPage(){
        OrderPage orderPage = new OrderPage(driver);
        BasketPage basketPage = new BasketPage(driver);
        basketPage.OrderPage();
        orderPage.addTextToInput();
    }
    @AfterTest
    public static void endTest()
    {
        report.endTest(test);
        report.flush();
    }
}
