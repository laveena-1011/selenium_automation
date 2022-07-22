package AttendanceSheet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Attendacesheet extends base {
    @Test
	public void attendance() {
    	
    	String parentwindow = driver.getWindowHandle();
    	System.out.println("Window info:"+parentwindow);
    	
    	
		WebElement fName = driver.findElement(By.xpath("//div[contains(@class,'rFrNMe k3kHxc')]//div"));
		fName.sendKeys("first name.....");
		
		
		WebElement date = driver.findElement(By.xpath("//input[@max='2072-01-01']"));
		date.sendKeys("16-07-2022");
		
		
		
	}

}
