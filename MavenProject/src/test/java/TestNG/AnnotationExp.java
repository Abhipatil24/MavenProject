package TestNG;

import org.testng.annotations.*;

import javax.swing.*;

public class AnnotationExp {

   @BeforeMethod
   public void Precondition(){
       System.out.println("this is pre condition"); // it will be executed every time before execute test case
   }

   @BeforeClass // //it will be executed once before  BeforeMethod or first test case
   public void BeforeClassExp(){
       System.out.println("this is before class");
   }

    @Test(groups = {"smoke"})
    public void Case1(){
        System.out.println("this is test case 1");
    }


    @AfterClass //it will be executed once After AfterMethod or first test case
    public void AfterClassExp(){
        System.out.println("this is after class exp");
    }

    @AfterMethod
    public void Postcondition(){
        System.out.println("this is post condition"); // it will be executed every time After execute test case
    }

    @BeforeTest
    public void BeforeTestExp(){
        System.out.println("this is before test");
    }

    @AfterTest
    public void AfterTestExp(){
        System.out.println("this is before test");
    }


}



