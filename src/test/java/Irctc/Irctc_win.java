package Irctc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Irctc_win extends base{
	
	@Test
	public void click() throws Exception {
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("window info:" +parentWindow);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		
		WebElement btn_hotel = driver.findElement(By.xpath("//a[@href='https://www.hotel.irctctourism.com/']"));
		btn_hotel.click();
		System.out.println("hotel window is opened......");
		Thread.sleep(4000);
		
		
		WebElement btn_login = driver.findElement(By.xpath("//a[@class='nav-link']"));
		btn_login.click();
	}

}
 