package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertexp {

    @Test
    public void VerifySoftAssert(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        String element = driver.findElement(By.xpath("//span[text()='Products']")).getText();
        String element2 = driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();

        SoftAssert sf= new SoftAssert();


        sf.assertEquals(element, "Products");//if this assert fail then also subsequent assert will be executed and test case will pass
        sf.assertEquals(element2,"Swag Labs");

        sf.assertAll();

        driver.close();







    }

}
