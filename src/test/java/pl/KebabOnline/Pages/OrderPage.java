package pl.KebabOnline.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    username.sendKeys("Komar");
    adress.sendKeys("Jasionka 31");
    phone.sendKeys("123321149");
    info.sendKeys("Sos: mieszany, mięso: baranina");
    orderButton.click();
    }



}
