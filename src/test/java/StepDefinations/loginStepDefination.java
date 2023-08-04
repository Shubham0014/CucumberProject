package StepDefinations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDefination {
	public WebDriver driver;
	@Given("initialize chromedriver")
	public void initialize_chromedriver() {
	  driver=new ChromeDriver();
		
	}
	@When("navigate to the url")
	public void navigate_to_the_url() {
		driver.get("https://login.salesforce.com/");
	 
	}
	@When("user eneters username and password and click on click")
	public void user_eneters_username_and_password_and_click_on_click() {
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test123");
	  driver.findElement(By.xpath("//input[@id='Login']")).click();
	}
	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
	System.out.println("hello");
	}

}
