package AppDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeApp_LoginPage extends Base_class {

	@Test
	public void login_logout() throws InterruptedException {
		// User Name
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("Admin");
		Thread.sleep(3000);
		// Password
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
		Thread.sleep(3000);
		// click button
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(5000);
		String exceptedCurrentUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String actualCurrentUrl = driver.getCurrentUrl();
		System.out.println("URL is " + actualCurrentUrl);
		Assert.assertEquals(actualCurrentUrl, exceptedCurrentUrl, "not proper working");
		Thread.sleep(5000);

		// Action class
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
        //driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		Thread.sleep(5000);
	}

}
