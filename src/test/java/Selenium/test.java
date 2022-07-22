package Selenium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	
	private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {

        // driver required path -
        // https://chromedriver.storage.googleapis.com/index.html?path=103.0.5060.53/
//        System.setProperty("webdriver.chrome.driver",
//                "C:\\Users\\Act\\Downloads\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();



        //execute program on edge browser/opera/safari

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laveena\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();




        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void demo() throws Exception {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector("h1"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.id("welcome")).click();

        Thread.sleep(4000);
        driver.findElement(By.linkText("Logout")).click();
    }
}
