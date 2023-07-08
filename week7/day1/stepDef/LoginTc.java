package stepDef;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LoginTc extends BaseClass {

	/*
	 * public ChromeDriver driver; // for every feature step -->create individual
	 * methods
	 * 
	 * @Given("Launch the browser") public void lauchBrowser() { driver = new
	 * ChromeDriver(); }
	 * 
	 * @Given("Load the url") public void loadUrl() {
	 * driver.manage().window().maximize();
	 * driver.get("http://leaftaps.com/opentaps/");
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 * 
	 * }
	 */
	@Given("Enter the username as {string} and password as {string}")
	public void enterUsername(String username, String pwd) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	/*
	 * @Given("Enter the password as {string}") public void enterPassword(String
	 * pwd) { driver.findElement(By.id("password")).sendKeys(pwd);
	 * 
	 * }
	 */

	/*
	 * //use regular expression
	 * 
	 * @Given("Enter the username as (.*)$") public void enterUsername(String
	 * username) { driver.findElement(By.id("username")).sendKeys(username); }
	 * 
	 * 
	 * @Given("Enter the password as (.*)$") public void enterPassword(String pwd) {
	 * driver.findElement(By.id("password")).sendKeys(pwd);
	 * 
	 * }
	 */

	@When("Click the login")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("HomePage is displayed")
	public void verifyHomePage() {
		System.out.println(driver.getTitle());

	}

	@But("Error messaged is displayed")
	public void verifyTheErrormessage() {
		System.out.println("Chk the credentials");

	}

	@Then("WelcomePage is displayed")
	public void welcome_page_is_displayed() {
		System.out.println(driver.getTitle());
	}

	

	@When("Click the {string} link")
	public void click_the_link(String link) {
		driver.findElement(By.linkText(link)).click();

	}

	@Then("{string} Page is displayed")
	public void page_is_displayed(String pageName) {
		String text = driver.findElement(By.xpath("//div[text()='" + pageName + "']")).getText();
		System.out.println(text);
	}

	@When("Error messaged is dispalyed")
	public void error_messaged_is_dispalyed() {
		System.out.println("Check your Credentials");
	}
	
	
	/*
	 * @Then("LeadsPage is displayed") public void leads_page_is_displayed() {
	 * System.out.println(driver.getTitle());
	 * 
	 * }
	 * 
	 * @Then("CreateLeadPage is displayed") public void
	 * create_lead_page_is_displayed() { System.out.println(driver.getTitle());
	 * 
	 * }
	 */

}
