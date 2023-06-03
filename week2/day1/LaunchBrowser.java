package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
	
		//System.setProperty(null, null)
		//Step: 1 to launch the browser
		ChromeDriver driver =new ChromeDriver();		
	  //EdgeDriver d=new EdgeDriver();
		
		//to load application in browser 
		driver.get("http://leaftaps.com/opentaps/control/main");
		

	}

}
