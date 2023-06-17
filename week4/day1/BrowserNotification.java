package week4.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserNotification {

	public static void main(String[] args) {
		
	//Tohandle browser notification
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");		
		ChromeDriver driver =new ChromeDriver(opt);
		driver.get("https://www.snapdeal.com/");
		
	}

}
