package TestNG;

import org.testng.annotations.Test;

public class DependOnGrp {
    @Test(groups = {"smoke"})
    public void VerifyLogin(){
        System.out.println("verify login");
    }
    @Test(dependsOnGroups ="smoke")
    public void VerifyHomePage(){
        System.out.println("verify Home Page");
    }

    @Test
    public void VerifyAccountCreation3(){
        System.out.println("verify Account Creation");
    }
}
