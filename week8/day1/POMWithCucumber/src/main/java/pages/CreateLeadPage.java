package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod {


	/*
	 * public CreateLeadPage(RemoteWebDriver driver) { this.driver=driver; }
	 */

	
	public CreateLeadPage enterCompanyName(String cname) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(cname);

		return this;
	}

	public CreateLeadPage enterFirstName(String fname) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fname);

		return this;
	}

	public CreateLeadPage enterLastName(String lname) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lname);

		return this;
	}

	public ViewLeadPage clickCreate() {
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}

}
