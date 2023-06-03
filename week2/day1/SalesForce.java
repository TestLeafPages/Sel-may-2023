package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();	
	    driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");		
		
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		
		//click on login button
		driver.findElement(By.id("Login")).click();	
		
		//verify the title of the page
		String title = driver.getTitle();
		System.out.println(title);
	
		//close the browser
		driver.close();
	}

}
