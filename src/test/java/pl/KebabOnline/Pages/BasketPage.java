package pl.KebabOnline.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BasketPage {

    @FindBy(xpath = "(//div[normalize-space()='Twoje zakupy'])")
    private WebElement yourShoppingPageOpen;

    @FindBy(xpath = "(//button[contains(text(),'Przejdź do płatności')])")
    private WebElement goToOrder;

    public BasketPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void OpenBasketPage(){
        yourShoppingPageOpen.click();
        Assert.assertEquals(yourShoppingPageOpen.getText(), "Twoje zakupy");
    }

    public void OrderPage(){
        goToOrder.click();
    }

}
