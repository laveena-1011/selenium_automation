package FB;

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

public class open {
	private WebDriver driver;
	  private Map<String, Object> vars;
	  JavascriptExecutor js;
	  @Before
	  public void setUp() {
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
	  public void fBopen() throws Exception {
	    driver.get("https://www.facebook.com/?stype=lo&jlou=Afc-ggCUPZUuxaZjXniSWx86PzrYLzrARPhaYex2wH9lMF1LFwTnqlIsjvIyYN9zWlXqwfDvWRZXav7T3F1wvzMjNF8--PX9Auq_Dez9N35xeg&smuh=59912&lh=Ac-jWW-ficzumkVETPU");
	    driver.findElement(By.cssSelector(".\\_s0")).click();
	    driver.findElement(By.cssSelector(".\\_6lux:nth-child(5) #pass")).sendKeys("love u mom");
	    driver.findElement(By.cssSelector(".\\_31ni")).click();
	    driver.findElement(By.cssSelector(".j83agx80 > .oajrlxb2 > .q9uorilb g")).click();
	    driver.findElement(By.cssSelector("div:nth-child(5) > .oajrlxb2 .d2edcug0")).click();
	    {
            List<WebElement> elements = driver.findElements(By.cssSelector("h1"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.id("welcome")).click();

        Thread.sleep(4000);
        driver.findElement(By.linkText("Logout")).click();
	  }
	}
