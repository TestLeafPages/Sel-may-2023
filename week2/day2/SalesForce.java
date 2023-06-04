package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	    driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");		
		
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		
		//click on login button
		driver.findElement(By.id("Login")).click();	
		
		// to explict wait (java-wait)
		
		//Thread.sleep(3000);
		
		//verify the title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	   //NosuchElement exception
		//close the browser
		//driver.close();
		
		
	}

}
