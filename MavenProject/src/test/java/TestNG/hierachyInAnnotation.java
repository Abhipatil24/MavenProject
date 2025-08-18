package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class hierachyInAnnotation {
         WebDriver driver;

    @BeforeMethod //precondition
    public void PreCondition(){
        driver =new ChromeDriver();

    }

    @Test(groups = {"smoke"})
    public void testCase1() {
        driver.get("https://www.flipkart.com/");
    }

    @Test(groups = {"smoke"})
    public void testCase2() {
        driver.get("https://www.Amazon.com/");
    }

    @AfterMethod
    public void postCondation(){
        driver.close();
    }



    }


