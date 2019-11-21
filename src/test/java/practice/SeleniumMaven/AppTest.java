package practice.SeleniumMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;



public class AppTest{ 
   
	public WebDriver driver;
	@BeforeTest
	public void pre () {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://www.newtours.demoaut.com/");
	}
	
	@org.testng.annotations.Test
	public void test() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		boolean login = driver.findElement(By.name("login")).isDisplayed();
		Assert.assertTrue(login);
		driver.findElement(By.name("login")).click();
	}

}