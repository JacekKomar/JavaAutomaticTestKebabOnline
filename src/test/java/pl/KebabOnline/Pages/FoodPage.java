package pl.KebabOnline.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FoodPage {

    @FindBy(xpath = "(//a[normalize-space()='Dania'])")
    private WebElement openKebabFoodPage;

    @FindBy(xpath = "//div//div//div//div[1]//button[1]")
    private WebElement orderFoodButton;




//    public void foodButton(String label){
//        driver.findElement(By.xpath("(//i)" + label + "")).click();
//    }


    public FoodPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


        public void  openKebabFoodPageClick() {
            openKebabFoodPage.click();
        }

    public void  orderFoodButtonClick() {
        orderFoodButton.click();
    }


    }







