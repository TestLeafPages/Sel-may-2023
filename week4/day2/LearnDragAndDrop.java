package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDrop {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement drag = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(drag, 400, 100).perform();
		
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement destn = driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		act.dragAndDrop(source, destn).perform();
		
		
	}

}
