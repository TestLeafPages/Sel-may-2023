package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
		public ChromeDriver driver ;
		
	@BeforeSuite	
	public void cloudConnection() {
		System.out.println("Start the cloud connection");
	}
	
	
	@BeforeTest	
	public void testSet() {
		System.out.println("TestSet informantions");
	}
	
	@BeforeClass	
	public void testCase() {
		System.out.println("Testcase informantions");
	}
	
	
	@BeforeMethod	
	public void preCondition()
	{
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	    }
	
	@AfterMethod
	public void postCondition() {
		driver.close();
		
	}
	
	
	@AfterSuite	
	public void closeConnection() {
		System.out.println("close the cloud connection");
	}
	
	
	@AfterTest	
	public void tearDown() {
		System.out.println("Teardown");
	}
	
	
	
	@AfterClass	
	public void closReport() {
		System.out.println("Stop report");
	}
	
	
}
