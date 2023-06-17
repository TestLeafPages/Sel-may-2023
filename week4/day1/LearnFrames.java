package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//switch to the frame
		driver.switchTo().frame(0); //index start with zero
		
		driver.findElement(By.id("Click")).click();//inside frame
		
		//take you out of all the frames to the main content of the page
		driver.switchTo().defaultContent();
		String text = driver.findElement(By.xpath("(//h5)[6]")).getText();
		//driver.switchTo().frame(1);
		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		System.out.println(findElements.size());
		
		System.out.println(text);
		
		//to handle nested frame
		//get into first frame
		//get into second frame
		//act on the element
		WebElement frameElement = driver.findElement(By.xpath("(//iframe)[3]"));
		
		driver.switchTo().frame(frameElement);//outer frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame2']")));//inner frame->id attribute value as arg
		driver.findElement(By.id("Click")).click();
				
		driver.switchTo().defaultContent();
	//	driver.switchTo().parentFrame(); //switch between two frames present inside one parent frame
		
		
		
	}

}
