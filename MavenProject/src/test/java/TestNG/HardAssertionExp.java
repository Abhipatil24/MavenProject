package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionExp {
//Hard assert
        @Test
        public void VerifyHardAssert() {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();

            String element = driver.findElement(By.xpath("//span[text()='Products']")).getText();
            String element2 = driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();

            //Assertion
            Assert.assertEquals(element,"Products","product should be display");
            Assert.assertEquals(element2,"Swag Labs");

            driver.close();

        }
        }




