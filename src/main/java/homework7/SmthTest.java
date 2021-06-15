package homework7;

import homework7.interfaces.AfterSuite;
import homework7.interfaces.BeforeSuite;
import homework7.interfaces.Test;


public class SmthTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

//    @BeforeSuite
//    public void beforeSuite1() {
//        System.out.println("Before Suite");
//    }

    @Test(priority = 3)
    public void test3() {
        System.out.println("Test 3");
    }

    @Test(priority = 1)
    public void test1() {
        System.out.println("Test 1");
    }

    @Test(priority = 2)
    public void test2A() {
        System.out.println("Test 2A");
    }

    @Test(priority = 2)
    public void test2B() {
        System.out.println("Test 2B");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

//    @AfterSuite
//    public void afterSuite1() {
//        System.out.println("After Suite");
//    }
}