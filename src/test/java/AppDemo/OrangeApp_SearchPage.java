package AppDemo;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class OrangeApp_SearchPage extends  Base_class {

	@Test
	public void getLogin() throws InterruptedException {
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
		// search
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		search.sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a/span")).click();
		Thread.sleep(3000);
	}
}
