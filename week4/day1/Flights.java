package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>win=new ArrayList<String>(windowHandles);
		driver.switchTo().window(win.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(win.get(0));
		driver.close();

		
		
	
	}

}
