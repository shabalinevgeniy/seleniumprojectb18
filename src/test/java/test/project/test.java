package test.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class test {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://qa2.vytrack.com/user/login");
        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys("user160");
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys("UserUser123");
        driver.findElement(By.xpath("//*[@id='_submit']")).click();
    }
    @Test
    public void vehicle_fuel_verification() throws Exception {
        WebElement fleetOptions = driver.findElement(By.xpath("//*[@class='title title-level-1'][1]"));
        fleetOptions.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[7]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div/div[2]/a")).click();
    }
    @AfterMethod
    public void tearDown() throws Exception{
        Thread.sleep(2000);
        driver.quit();
    }
}