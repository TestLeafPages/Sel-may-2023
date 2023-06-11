package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftaps {

	public static void main(String[] args) {

		ChromeDriver driver =new ChromeDriver();
		  driver.get("http://leaftaps.com/opentaps/control/main");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  List<WebElement> textBox = driver.findElements(By.xpath("//input[@class='inputLogin']"));
		  System.out.println(textBox.size());

		  textBox.get(0).sendKeys("demosalesManager");
		  textBox.get(1).sendKeys("crmsfa");
	
	}

}
