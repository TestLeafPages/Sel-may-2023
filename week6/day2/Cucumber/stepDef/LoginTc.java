package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTc {

	public ChromeDriver driver;
	// for every feature step -->create individual methods

	@Given("Launch the browser")
	public void lauchBrowser() {
		driver = new ChromeDriver();
	}

	@Given("Load the url")
	public void loadUrl() {
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@Given("Enter the username as {string}")
	public void enterUsername(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	}

	@Given("Enter the password as {string}")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);

	}

	@When("Click the login")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("HomePage is displayed")
	public void verifyHomePage() {
		System.out.println(driver.getTitle());

	}
	

	@But("Error messaged is dispalyed")
	public void verifyTheErrormessage() {
		System.out.println("Chk the credentials");

	}
	

}
