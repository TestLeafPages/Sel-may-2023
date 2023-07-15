package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod {

	/*
	 * public ViewLeadPage(RemoteWebDriver driver) { this.driver=driver; }
	 */
	
	
	public ViewLeadPage verifyViewLead() {
		System.out.println(getDriver().getTitle());
		return this;
	}
}
