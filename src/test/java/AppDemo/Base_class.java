package AppDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {
	WebDriver driver;
	String baseUrl = "https://opensource-demo.orangehrmlive.com/";

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void browserSetup() {
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\hi\\OneDrive\\Desktop\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		//driver = new ChromeDriver();
	    //driver=new InternetExplorerDriver(); 
	    driver=new FirefoxDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get(baseUrl);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
