package conditionaltest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ConditionalTest extends base {
	
      @Test
      public void test1() {
    	  WebDriverWait wait = new WebDriverWait(driver,120);
    	  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input[id='text3']"))); 	  
    	  WebElement inputtxt3 = driver.findElement(By.cssSelector("input[id='text3']"));
    	  inputtxt3.sendKeys("toyota");
    	 
    	  
    	  
    	
      }
      
}
