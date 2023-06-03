package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args) {
		//Setup the driver -ctrl shift o
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the screen
		driver.manage().window().maximize();	
		
		//identify the username input box(text box)
		//find the ele( textbox) -->using attribute-->enter text
		//unique value -->first prefered locator-->id
		//name
		//classname
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");		
		//sendKeys-->enter the value in the text box
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
	
		//close the browser
		driver.close();
	}

}
