package webdriverMavenGit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
	}
	@Test
	public void doLogin() 
	{
		driver.get("http://gmail.com");	
		driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/div[2]")).click();
		
		/*
		 * 
		 * added new comments.
		 * 
		 */
		
	}
	@AfterSuite
	public void tearDown() {
		//driver.quit();
	

}
}