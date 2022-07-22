package hrm;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class hrmlogin_config extends base{
    @Test
    public void login() {
    	log.info("enter userName : " + conf.getadminUserName());
        driver.findElement(By.name("txtUsername")).sendKeys(conf.getadminUserName());
        log.info("enter password: " + conf.getadminPassword());
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys(conf.getadminPassword());
        log.info("Click on login button");
        driver.findElement(By.name("Submit")).click();

        //validation step
        Boolean verifyDashBoard = driver.findElement(By.tagName("h1")).isDisplayed();

        if(verifyDashBoard) {
            Assert.assertTrue(verifyDashBoard);
            log.info("Verification of dashboard sucessfully.");
        }

        else {
            log.info("Verification of dashboard is failed.");
            Assert.assertTrue(verifyDashBoard);
        }
    }
}


    	//driver.findElement(By.name("txtUsername")).sendKeys(conf.adminUserName());
	    //driver.findElement(By.cssSelector("input#txtPassword")).sendKeys(conf.adminPassword());
    	//driver.findElement(By.name("Submit")).click();
    	
    	//System.out.println(conf.getApplication_QAURL());
    	//System.out.println(conf.getApplication_DEVURL());
    	//System.out.println(conf.adminUserName());
    	//System.out.println(conf.adminPassword());
    	