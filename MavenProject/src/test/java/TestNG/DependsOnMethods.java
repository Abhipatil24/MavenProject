package TestNG;

import org.testng.annotations.Test;

public class DependsOnMethods {
    @Test
    public void VerifyLogin(){
        System.out.println("verify login");
    }
    @Test(dependsOnMethods ="VerifyLogin")
    public void VerifyHomePage(){
        System.out.println("verify Home Page");
    }

    @Test
    public void VerifyAccountCreation3(){
        System.out.println("verify Account Creation");
    }
}
