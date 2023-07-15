package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class LeadsPage extends ProjectSpecificMethod{

	/*
	 * public LeadsPage(RemoteWebDriver driver) { this.driver=driver; }
	 */

	public CreateLeadPage clickCreateLead() {
		getDriver().findElement(By.linkText(prop.getProperty("MyLeadsPage.CreateLead.Linktext"))).click();
		return new CreateLeadPage();
	}
}
