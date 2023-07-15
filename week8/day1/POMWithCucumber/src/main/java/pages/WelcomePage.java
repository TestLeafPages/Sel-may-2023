package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;

public class WelcomePage extends ProjectSpecificMethod {


	/*
	 * public WelcomePage(RemoteWebDriver driver) { this.driver=driver; }
	 */
	@Then("HomePage is dispalyed")
	public WelcomePage verifyLogin() {
		System.out.println(getDriver().getTitle());
		// return new WelcomePage();
		return this;
	}

	public MyHomePage clickCRMSFA() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}

	public void clickLogout() {

	}

}
