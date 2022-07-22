package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class amazon2 {
	 //Priority
    //Default priority : 0
    //Same priority: naming con: aplha
    //highest negative number having highest priority



    @BeforeTest
    public void setup() {
        System.out.println("launching browser...open app");

    }

    @AfterTest
    public void teardown() {
        System.out.println("closing app....");

    }

    @Test(priority = 3)
    public void payment() {

        System.out.println("payment test case");
    }

    @Test(priority = 1)
    public void login() {

        System.out.println("login test case");
    }

    @Test(priority = 4)
    public void logout() {
        System.out.println("logout test case");

    }

    @Test(priority = 2)
    public void addItemsToCart() {

        System.out.println("addItemsToCart test case");
    }



}
