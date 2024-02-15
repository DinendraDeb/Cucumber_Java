package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps {
	
	WebDriver driver; 
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside step - browser is open");
		System.setProperty("webdriver.gecko.driver",
				"C:\\\\Users\\\\debdi\\\\OneDrive\\\\Desktop\\\\Selenium\\\\Selenium_2023\\\\geckodriver-v0.33.0-win32\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
	    
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.get("https://example.testproject.io/web/");
	    
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.id("name")).sendKeys("Raghav");
		driver.findElement(By.id("password")).sendKeys("12345");
	    
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		driver.findElement(By.id("login")).click();
	    
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		driver.findElement(By.id("logout")).isDisplayed();
		driver.close();
		driver.quit();
	    
	}

}
