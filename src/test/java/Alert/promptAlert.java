package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class promptAlert extends base {

	@Test
	public void PromptAlert() throws Exception {

		driver.findElement(By.xpath("//button[contains(@onClick,'myFunctionf()')]")).click();
		Thread.sleep(4000);

		Alert prompt_Alert = driver.switchTo().alert();
		System.out.println("Alert Text:" + prompt_Alert.getText());

		Assert.assertEquals(prompt_Alert.getText(), "Your Name Please");
		Assert.assertTrue(prompt_Alert.getText().contains("alert message"));

		prompt_Alert.dismiss();

	}
}
