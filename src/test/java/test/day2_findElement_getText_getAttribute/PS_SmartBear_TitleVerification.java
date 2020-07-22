package test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PS_SmartBear_TitleVerification {

    public static void main(String[] args) {

        //TC #5: Basic login authentication
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        //3- Verify title equals:
        //Expected: Web Orders Login
        String actualTitle = driver.getTitle();
        String expectedTitle= "Web Orders Login";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("HomePage title verification PASSED!");
        }else {
            System.out.println("HomePage title verification FAILED!!!");
        }
        //4- Enter username: Tester
        //driver.findElement()
        //5- Enter password: test
        //6- Click “Sign In” button
        //7- Verify title equals:
        //Expected: Web Orders


    }

}