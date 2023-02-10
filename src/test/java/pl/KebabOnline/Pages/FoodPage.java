package pl.KebabOnline.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import pl.KebabOnline.Tests.UnitedTestCode;

import java.util.logging.Logger;

public class FoodPage {
    java.util.logging.Logger logger = Logger.getLogger(UnitedTestCode.class.getName());
    @FindBy(xpath = "(//a[normalize-space()='Dania'])")
    private WebElement openKebabFoodPage;

    @FindBy(xpath = "//div//div//div//div[1]//button[1]")
    private WebElement orderFoodButton;


    public FoodPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void openKebabFoodPageClick()
    {
        openKebabFoodPage.click();
//            Logger.info("aa");
    }

    public void  orderFoodButtonClick()
    {
        orderFoodButton.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(orderFoodButton.isSelected(), "Kliknięto zamów.");
        logger.info("ww");
    }

}
