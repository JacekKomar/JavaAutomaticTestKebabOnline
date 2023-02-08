package pl.KebabOnline.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DrinksPage {

    @FindBy(xpath = "(//a[normalize-space()='Napoje'])")
    private WebElement openDrinksPage;

    @FindBy(xpath = "(//button[contains(text(),'Zamów')])[1]")
    private WebElement orderDrinksButton;

    public DrinksPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void  openDrinksPageClick() {
        openDrinksPage.click();
    }

    public void  orderDrinksButtonClick() {
        orderDrinksButton.click();
    }


}










