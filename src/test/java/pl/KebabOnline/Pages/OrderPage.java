package pl.KebabOnline.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OrderPage {

    @FindBy(xpath = "(//input[@id='exampleInputEmail1'])")
    WebElement name;

    @FindBy(xpath = "(//input[@id='Username'])")
    WebElement username;

    @FindBy(xpath = "(//input[@id='Adress'])")
    WebElement adress;

    @FindBy(xpath = "(//input[@id='Phone'])")
    WebElement phone;

    @FindBy(xpath = "(//input[@id='info'])")
    WebElement info;

    @FindBy(xpath = "(//button[contains(text(),'Zamów')])")
    WebElement orderButton;

    public OrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void addTextToInput() {
    name.sendKeys("Jacek");
        Assert.assertEquals(name.getAttribute("value"), "Jacek");
    username.sendKeys("Komar");
        Assert.assertEquals(username.getAttribute("value"), "Komar");
    adress.sendKeys("Jasionka 31");
        Assert.assertEquals(adress.getAttribute("value"), "Jasionka 31");
    phone.sendKeys("123321149");
        Assert.assertEquals(phone.getAttribute("value"), "123321149");
    info.sendKeys("Sos: mieszany, mięso: baranina");
        Assert.assertEquals(info.getAttribute("value"), "Sos: mieszany, mięso: baranina");
    orderButton.click();

    }

}
