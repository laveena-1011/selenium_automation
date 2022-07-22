package hrm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	 WebDriver driver;

	    @Before
	    public void launchApp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://opensource-demo.orangehrmlive.com/");

	        //maximize browser
	        driver.manage().window().maximize();

	    }

	    @After
	    public void closeApp() throws Exception {

	        Thread.sleep(4000);
	        driver.close();        
	    }

	    @Test
	    public login()throws Exception {

	        WebElement txt_userName = driver.findElement(By.id("txtUsername"));
	        txt_userName.sendKeys("Admin");
	        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	        driver.findElement(By.className("button")).click();


	        Thread.sleep(4000);
	        //validation step
	        //Dashboard - view
	        //Application URL


	        String actualText = driver.findElement(By.tagName("h1")).getText();
	        System.out.println("Text: " + actualText);


	        Assert.assertEquals(actualText, "Dashboard");

//	        String name = "abhishek";
//	        String name1 = "Abhishek";
//	        
//	        System.out.println(name.equalsIgnoreCase(name1));     //true 

	        String actualApplicationURL = driver.getCurrentUrl();
	        System.out.println("URL: " +actualApplicationURL);

	        Assert.assertEquals(actualApplicationURL, "https://opensource-demo.orangehrmlive.com/index.php/dashboard", "error message: Application URL mismatch");

	        //Logout

	        //click on Welcome
	        driver.findElement(By.partialLinkText("Welcome")).click();

	        Thread.sleep(1000);

	        driver.findElement(By.linkText("Logout")).click();


	        String actualApplicationURLAfterLogout = driver.getCurrentUrl();
	        System.out.println("URL after Logout: " +actualApplicationURLAfterLogout);

	        Assert.assertEquals(actualApplicationURLAfterLogout, "https://opensource-demo.orangehrmlive.com/index.php/auth/login", "error message: Application URL mismatch");


	    }

	}
