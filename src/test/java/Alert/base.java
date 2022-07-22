package Alert;

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
    	 driver.get("http://only-testing-blog.blogspot.com/");
    	 driver.manage().window().maximize();
     }
     @AfterTest
     public void CloseApp() throws Exception {
    	 Thread.sleep(4000);
    	 driver.close();
     }
}
