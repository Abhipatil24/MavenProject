package TestNG;

import org.testng.annotations.Test;

public class PriorityExp {

    @Test(priority = 5)
    public void Test4(){
        System.out.println("this is test 4");
    }

    @Test
    public void Test2(){
        System.out.println("this is test 2 ");
    }

    @Test
    public void Test1(){
        System.out.println("this is test 1 ");
    }

    @Test
    public void Test3(){
        System.out.println("this is test 3 ");
    }

    //Alphabetical order
    @Test
    public void TestA(){
        System.out.println("this is test A ");
    }

    @Test
    public void TestB(){
        System.out.println("this is test B ");
    }

    @Test
    public void TestC(){
        System.out.println("this is test C ");
    }

    @Test
    public void TestD(){
        System.out.println("this is test D ");
    }
}
