package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;



import base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod{


	/*
	 * public MyHomePage(RemoteWebDriver driver) { this.driver=driver; }
	 */
	public LeadsPage clickLeads() {
		getDriver().findElement(By.linkText(prop.getProperty("MyHomePage.Leads.Linktext"))).click();
		return new LeadsPage();

	}
}
