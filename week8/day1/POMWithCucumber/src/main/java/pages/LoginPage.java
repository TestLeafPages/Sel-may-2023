package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethod {
	
	/*
	 * public LoginPage(RemoteWebDriver driver) { this.driver=driver; }
	 */

	@Given("Enter the username")
	public LoginPage enterUsername() {
		getDriver().findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		System.out.println(getDriver());
		return this;
	}

	@Given("Enter the password")
	public LoginPage enterPassword() {
		getDriver().findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		return this;
	}

	@When("Click the Login")
	public WelcomePage clickLogin() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}

}
