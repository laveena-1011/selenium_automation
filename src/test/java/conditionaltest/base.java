package conditionaltest;

import java.util.concurrent.TimeUnit;

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
    	 driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     }
     @AfterTest
     public void CloseApp() throws Exception {
    	 Thread.sleep(4000);
    	 driver.close();
     }
}
