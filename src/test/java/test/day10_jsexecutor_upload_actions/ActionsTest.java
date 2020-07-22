package test.day10_jsexecutor_upload_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;

public class ActionsTest {

    @Test
    public void hover_over_test1(){
        Driver.getDriver().get("http://amazon.com");

        //1-Create the instance of Action class
        //2- Pass the current driver instance

        Actions actions = new Actions(Driver.getDriver());

        //3-Locate the web element to hover over

        WebElement languageOptions = Driver.getDriver().findElement(By.id("icp-nav-link-inner"));

        //4- Using actions, hover over to the language options

        actions.moveToElement(languageOptions);

    }

}