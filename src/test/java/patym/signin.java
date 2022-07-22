package patym;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class signin extends base {
	
	
	@Test
    public void verifySign() throws Exception {

        driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();


        //Thread.sleep(4000);


        //Alert/Frame/windows ------ driver.switchTo()

        //Element are inside frame
        //get Text: To Login into your Paytm Web account
        //click on Watch Video

        driver.switchTo().frame(0);   //index ---- start from 0

        String headingText = driver.findElement(By.cssSelector(".heading")).getText();
        System.out.println(headingText);
        Assert.assertTrue(headingText.contains("To Login into your Paytm Web account"));
        driver.findElement(By.xpath("//span[contains(text(),'Watch Video')]")).click();




    }



}

