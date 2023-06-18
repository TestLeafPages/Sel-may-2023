package week4.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealClassroom {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      	ChromeDriver driver = new  ChromeDriver();		
		driver.get("https://www.snapdeal.com/");		
		driver .manage().window().maximize();		
		driver.findElement(By.xpath("//button[text()='NOT NOW']")).click();
		WebElement men= driver.findElement(By.xpath("//span[@class='catText']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(men).perform();
		WebElement shirt= driver.findElement(By.xpath("//span[text()='Shirts']"));
		a.moveToElement(shirt).click(shirt).perform();
		WebElement firstImg= driver.findElement(By.xpath("//img[@class='product-image ']"));
		WebElement qView= driver.findElement(By.xpath("//div[contains(text(),'Quick View')]"));
		a.moveToElement(firstImg).moveToElement(qView).click(qView).perform();
		

		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File path=new File("./snap/shot.png");//empty file
		FileUtils.copyFile(screenshotAs, path);
		
}
}