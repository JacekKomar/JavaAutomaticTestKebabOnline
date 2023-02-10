package pl.KebabOnline.Tests;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.logging.Logger;

public class Main {

    java.util.logging.Logger logger = Logger.getLogger(UnitedTestCode.class.getName());

    protected WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jacekkomar.github.io/KebabOnline/index.html");
    }

    @AfterTest
    public void quitPage(){
        driver.quit();
    }

    public void foodAddButton(String label){
        driver.findElement(By.xpath("(//i[@class=\"bi bi-plus-square\"])" + label +"")).click();
    }

    public void foodDeleteButton(String label){
        driver.findElement(By.xpath("(//i[@class=\"bi bi-dash-square\"])" + label +"")).click();
    }

    public void drinksAddButton(String label){
        driver.findElement(By.xpath("(//i[@class=\"bi bi-plus-square\"])" + label +"")).click();
    }

    public void drinksDeleteButton(String label){
        driver.findElement(By.xpath("(//i[@class=\"bi bi-dash-square\"])" + label +"")).click();
    }

    public void inBasketAddButton(String label) {

        driver.findElement(By.xpath("(//i[@class=\"bi bi-plus-square\"])" + label + "")).click();
    }

    public void inBasketDashButton(String label) {
        driver.findElement(By.xpath("(//i[@class=\"bi bi-dash-square\"])" + label + "")).click();
    }

    public void inBasketDeleteItemButton(String label) {
        driver.findElement(By.xpath("(//i[@class=\"bi bi-x-lg\"])" + label + "")).click();
    }

    static ExtentTest test;
    static ExtentReports report;
    @BeforeClass
    public static void startTest()
    {
        report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
        test = report.startTest("ExtentDemo");
    }

    @AfterClass
    public static void endTest()
    {
        report.endTest(test);
        report.flush();
    }
}
