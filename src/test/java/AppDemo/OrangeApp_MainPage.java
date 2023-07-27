package AppDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeApp_MainPage extends Base_class{
	

	@Test(priority = 1)
	public void getTitle() throws InterruptedException {
		String exceptedTitle = "OrangeHRM";
		String actualTitle = driver.getTitle();
		System.out.println("Title is " + actualTitle);
		Assert.assertEquals(actualTitle, exceptedTitle, "not proper working");
		Thread.sleep(5000);
	}
	
	@Test(priority = 1)
	public void getCurrentUrl() throws InterruptedException {
		
		String exceptedCurrentUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String actualCurrentUrl = driver.getCurrentUrl();
		System.out.println("URL is " + actualCurrentUrl);
		Assert.assertEquals(actualCurrentUrl, exceptedCurrentUrl, "not proper working");
		Thread.sleep(5000);
	}
	
	@Test
	public void getPageSource() throws InterruptedException {
		String actualPageSource = driver.getPageSource();
		System.out.println("Page Source is " + actualPageSource);
		Thread.sleep(5000);
	}

	
}
