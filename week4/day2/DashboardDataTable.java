package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DashboardDataTable {

	public static void main(String[] args) throws IOException {

		
		ChromeDriver driver =new ChromeDriver();		
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
		List<WebElement> row = driver.findElements(By.xpath("//div[@class='ui-panel-content ui-widget-content']/table/tbody/tr"));
	
		for(int i=1;i<=row.size();i++)
		{
			String text = driver.findElement(By.xpath("//div[@class='ui-panel-content ui-widget-content']/table/tbody/tr["+i+"]/td[1]")).getText();
			System.out.println(text);
		}		
		
		// to take screen shot of complete webpage
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File path=new File("./snap/shot.png");//empty file
		FileUtils.copyFile(screenshotAs, path);
		
		//to take screenshot of particular webelement
		WebElement country = driver.findElement(By.xpath("//div[@class='ui-panel-content ui-widget-content']/table/tbody/tr[1]/td[1]"));
		
		File source = country.getScreenshotAs(OutputType.FILE);
		File destn=new File("./snap1/country.jpg");//empty file
		FileUtils.copyFile(source, destn);
		
		
		
	}

}
