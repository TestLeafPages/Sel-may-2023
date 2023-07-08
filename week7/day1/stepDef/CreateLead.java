package stepDef;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {

	@When("Enter the CompanyName")
	public void enterCnmae() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TL");

	}

	@When("Enter the FirstName")
	public void enterFname() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");

	}

	@When("Enter the LastName")
	public void enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");

	}

	@When("Click the createlead button")
	public void clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
		// leadId=webElement.getText();

	}

	@Then("ViewLead page is displayed")
	public void verifyViewLead() {
		System.out.println(driver.getTitle());
	}
}
