package TestNG;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;


public class ParameterizatioWithExel {

    @DataProvider(name ="test-data")
    public Object[][] dataProFun() throws IOException {
        Object[][] arrayObject = getExelData("C:\\software testing\\automation testing\\MavenProject\\data.xlsx","data");
        return arrayObject ;
    }

    //get exal data
    public static Object [][] getExelData(String pathName , String sheetName ) throws IOException {
        FileInputStream F = new FileInputStream(pathName);
        Workbook Wb = new XSSFWorkbook(F);

        Sheet sh = Wb.getSheet(sheetName);

        int rows = sh.getPhysicalNumberOfRows();
        int cols = sh.getRow(0).getPhysicalNumberOfCells();


        Object[][] data = new Object[rows-1][cols];

        for (int i = 1; i < rows; i++) {
            Row r = sh.getRow(i);
            for (int j = 0; j < cols; j++) {
                Cell c = r.getCell(j,Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                data[i - 1][j] = c.toString();
            }
        }
        Wb.close();
        F.close();
        return data;
    }

    @Test(dataProvider = "test-data")
    public void NeeofParameterization(String username, String password) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(username);
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(3000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}
