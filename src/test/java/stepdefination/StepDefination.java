package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	public WebDriver driver;
	@Given("^open browser and enter url$")
	public void open_browser_and_enter_url() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "D:\\selenium work\\maven\\drivers\\chromedriver.exe");
		  
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com/");
	}

	@When("^enter user name and password and click$")
	public void enter_user_name_and_password_and_click() throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");  
	}

	@Then("^user login into application$")
	public void user_login_into_application() throws Throwable {
		driver.findElement(By.name("login")).click();
	}

	@When("^user click on signoff$")
	public void user_click_on_signoff() throws Throwable {
		driver.findElement(By.linkText("SIGN-OFF"));
	}

	@Then("^user logout from application$")
	public void user_logout_from_application() throws Throwable {
	   driver.close();
	}



}
