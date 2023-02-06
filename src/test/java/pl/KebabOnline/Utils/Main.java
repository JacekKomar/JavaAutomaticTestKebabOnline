package pl.KebabOnline.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Main {
    protected WebDriver driver;

    @BeforeTest
    public void setup(){
//        DriverFactory.getDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jacekkomar.github.io/KebabOnline/index.html");
    }

//    @AfterTest
//    public void quitPage(){
//        driver.quit();
//    }

}
