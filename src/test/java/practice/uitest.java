package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uitest {
	 WebDriver driver; 

	    @BeforeTest
	    public void launchApp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        //driver.get("https://opensource-demo.orangehrmlive.com/");
	        driver.get("http://www.uitestpractice.com/Students/Switchto");
	        // maximize browser
	        driver.manage().window().maximize();

	    }

	    @AfterTest
	    public void closeApp() throws Exception {

	        Thread.sleep(4000);
	        driver.close();
	    }
	    @Test
	    public void uitestopen() throws Exception {
	    	WebElement btn_modal =driver.findElement(By.xpath("//*[contains(text(),'nch mo')]"));
	    	JavascriptExecutor Js = (JavascriptExecutor) driver;
	    	Js.executeScript("arguments[0].click();",btn_modal );
	    	Thread.sleep(2000);
	    	
	    }
}