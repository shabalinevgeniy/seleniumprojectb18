package test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
    public static void main(String[] args) throws InterruptedException{
        //1 - set up the web driver
        WebDriverManager.chromedriver().setup();
        //2-create the instance of the chromedriver
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //3 - test if driver is working
        // String googleURL = "https://www.google.com";
        driver.get("https://www.google.com");
                System.out.println(driver.getTitle());


        // browser navigations
        //this line will take user to previous page
        Thread.sleep(2000); // this line adds 2000 milliseconds to wait = 2 seconds
        driver.navigate().back();

        Thread.sleep(2000); //Threa.sleep is being added just to be able to see the selenium movements
        driver.navigate().forward();

        Thread.sleep(2000);
        driver.navigate().refresh();

        driver.navigate().to("https://www.facebook.com");


        System.out.println("driver.getTitle() ==>"+driver.getTitle()) ;
        System.out.println("driver.getCurrentUrl() ==>"+driver.getCurrentUrl());

        System.out.println(driver.getPageSource());
         //driver.manage().window().maximize();


    }

}
