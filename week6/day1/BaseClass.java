package week5.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


public class BaseClass {
	/*
	 * public ChromeDriver driver ; public EdgeDriver driver1;
	 */
	public RemoteWebDriver driver;
	public String filename,shName;
	//public int index;
	
	@Parameters({"browser","username","password","url"})
	@BeforeMethod	
	public void preCondition(String browser,String username ,String password,String url)
	{
		//if browser=chrome -->new ChromeDriver
		//if browser=edge-->new EdgeDriver		
		if(browser.equalsIgnoreCase("chrome")) {
			 driver= new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge"))
		{
	     driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
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
	
	
	
	
	@DataProvider
	public String[][] sendData() throws IOException {
		//create a two dimensional array
		return ReadExcelData.readData(filename,shName); 
		
		
	}
	
}
