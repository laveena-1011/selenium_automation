package hrm;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.configRead;

public class base {
	WebDriver driver;
    configRead conf;
    Logger log;
    @BeforeTest
    public void launchApp() throws Exception {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //Create an object
        conf = new configRead();
        log = Logger.getLogger("Coforge_HRM_Login_Logout");
        PropertyConfigurator.configure(".\\configFolder\\logProperties");


        //log.info("============launchApp===================");
        //log.info("Application launched successfully on chrome browser, app URL: " + conf.getApplication_QAURL());
        driver.get(conf.getApplication_QAURL());
        //driver.get("https://opensource-demo.orangehrmlive.com/");
        //maximize browser
        driver.manage().window().maximize();





    }

    @AfterTest
    public void closeApp() throws Exception {

        //log.info("closing browser");
        Thread.sleep(4000);
        driver.close();        
    }


}
    	 //driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
    	 //driver.get("http://www.uitestpractice.com/Students/Switchto");
    	 //driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
    	 //driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
    	 //driver.get("https://www.amazon.in/");
    	 //driver.get("https://paytm.com/");

