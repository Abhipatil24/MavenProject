package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicOfTestNG {

    @Test
    public void testCase1(){
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void testCase2(){
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.Amzon.com/");
        driver.manage().window().maximize();
    }
}
