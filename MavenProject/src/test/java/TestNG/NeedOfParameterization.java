package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NeedOfParameterization {
    @Parameters({"username" ,"password"})
    @Test
    public void NeeofParameterization(String username, String password){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        String element = driver.findElement(By.xpath("//span[text()='Products']")).getText();
        String element2 = driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();



        driver.close();

    }
}
