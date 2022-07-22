package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class simpleAlert  extends base {
	
	
	
          @Test
          public void simplealert() throws Exception {
        	      
        	  driver.findElement(By.xpath("//input[@value='Show Me Alert']")).click();
        	  
        	  Thread.sleep(4000);
        	  
        	  
        	  Alert Simple_Alert = driver.switchTo().alert();
        	  System.out.println("Alert Text:" + Simple_Alert.getText());
        	  
        	  Assert.assertEquals(Simple_Alert.getText(), "Hi.. This is alert message!");
        	  Assert.assertTrue(Simple_Alert.getText().contains("alert message"));
        	  
        	  Simple_Alert.accept();
        	  
          }
	
	
	
}
