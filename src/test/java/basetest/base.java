package basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	WebDriver driver;
     @BeforeTest
     public void LaunchApp() {
    	 WebDriverManager.chromedriver().setup();
    	 driver = new ChromeDriver();
    	 //driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
    	 //driver.get("http://www.uitestpractice.com/Students/Switchto");
    	 //driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
    	 //driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
    	 //driver.get("https://www.amazon.in/");
    	 //driver.get("https://paytm.com/");
    	 driver.manage().window().maximize();
     }
     @AfterTest
     public void CloseApp() throws Exception {
    	 Thread.sleep(4000);
    	 driver.close();
     }
}
