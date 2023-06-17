package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnwindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String windowHandle = driver.getWindowHandle();//to get the currnt active window adress
		System.out.println(windowHandle);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath(" //span[text()='Open']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());		
		
		for (String wh : windowHandles) {
			System.out.println(wh);
		}
		
		List<String> winhand=new ArrayList<String>(windowHandles);		
		driver.switchTo().window(winhand.get(1));
		driver.close();
	    System.out.println(driver.getTitle());
		driver.switchTo().window(winhand.get(0));		
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> mulWin = driver.getWindowHandles();
		List<String> listWin=new ArrayList<String>(mulWin);		
	//	driver.switchTo().window(listWin.get(2));		

		//for ex,we have 3 opened windows,i need to close all windws other than my main window then how to hanlde it?
		/*
		 * for(int i=1;i<listWin.size();i++) { driver.switchTo().window(listWin.get(i));
		 * driver.close(); }
		 * 
		 * driver.switchTo().window(listWin.get(0)); driver.close();
		 */
	    driver.quit();
	}

}
