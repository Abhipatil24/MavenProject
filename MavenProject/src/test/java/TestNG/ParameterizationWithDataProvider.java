package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationWithDataProvider {

    @DataProvider(name ="test-data")
    public Object[][] dataProFun(){
        return new Object[][]{
                {"standard_user", "secret_sauce"},//right data
                {"standard_user", "secretTest"}//wrong data
        };
    }

    @Test(dataProvider = "test-data")
    public void NeeofParameterization(String username, String password) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

    }
}
