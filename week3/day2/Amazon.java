package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
	
		
	      ChromeDriver driver =new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile",Keys.ENTER);			  
		  List<WebElement> mPrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		  int size = mPrice.size();
		  
		  List<String> price=new ArrayList<String>();//empty
		  
	      System.out.println(mPrice);
		  for(int i=0;i<size;i++) {
			  String text = mPrice.get(i).getText();
	           price.add(text);
		  }	  
		  //convert the List<webElement>-->List<String>		  
			/*
			 * Collections.sort(price); System.out.println(price); String min =
			 * Collections.min(price); System.out.println(min);
			 */
		  
		  System.out.println(price);
		  
		  Set<String> uniqPrice=new LinkedHashSet<String>(price);
		  System.out.println(uniqPrice);
		  
		 		  
		  if(price.size()==uniqPrice.size()) {
			  System.out.println("No dup");
		  }else{
			  System.out.println("Found dup");
		  }
		  
	}

}
