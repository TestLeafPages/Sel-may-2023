package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnListInautomation {

	public static void main(String[] args) {
	  ChromeDriver driver =new ChromeDriver();
	  driver.get("https://www.facebook.com/login.php");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
	  //to find all the elements with common attribute -->link-->a
	  
	  List<WebElement> links = driver.findElements(By.tagName("a"));	  
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++) {
			String text = links.get(i).getText();
			System.out.println(text);
		}
		
		//to particular links in the webpage
		links.get(4).click();
		

	}

}
