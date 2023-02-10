package pl.KebabOnline.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DrinksPage {

    @FindBy(xpath = "(//a[normalize-space()='Napoje'])")
    private WebElement openDrinksPage;

    @FindBy(xpath = "(//button[contains(text(),'Zamów')])[12]")
    private WebElement orderDrinksButton;

    public DrinksPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void  openDrinksPageClick() {
        openDrinksPage.click();
//
    }

    public void drinksPageInfo() {
        Assert.assertEquals(openDrinksPage.getText(), "Napoje");
    }

    public void  orderDrinksButtonClick() {
        orderDrinksButton.click();
    }

    public void orderButtonInfo() {
        orderDrinksButton.click();
    }

}
