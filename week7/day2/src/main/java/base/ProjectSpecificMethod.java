package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcelData;



public class ProjectSpecificMethod {
	
	public RemoteWebDriver driver;
	public String filename, shName;

	@Parameters({"browser","url"})
	@BeforeMethod
	public void preCondition(String browser,  String url) {
		// if browser=chrome -->new ChromeDriver
		// if browser=edge-->new EdgeDriver
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	
	@DataProvider()
	public String[][] sendData() throws IOException {
		// create a two dimensional array
		return ReadExcelData.readData(filename, shName);

	}
	

}
