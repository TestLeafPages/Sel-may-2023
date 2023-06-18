package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnHoverAction {

	public static void main(String[] args) {
	
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//locate the element and hover on it
		
		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
		
		Actions act =new Actions(driver);
		//to hover
		act.moveToElement(men).perform();
		//scroll
		act.scrollByAmount(0,500).perform();
		
		//positive-->move down
		//negative-->move up
		
		WebElement contact = driver.findElement(By.xpath("(//a[text()='Contact Us'])[2]"));
		act.scrollToElement(contact).click(contact).perform();
		
	}

}
