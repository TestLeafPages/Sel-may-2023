package week.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the screen
		driver.manage().window().maximize();	
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		
	}

}
