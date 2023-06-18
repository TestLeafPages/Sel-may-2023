package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnToDoubleClick {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame("iframeResult");
		WebElement dClick = driver.findElement(By.xpath("//p[contains(text(),'Double-click')]"));
		
		Actions act=new Actions(driver);
		act.doubleClick(dClick).perform();
		//rightclick
		act.contextClick(dClick).perform();
		
	}

}
