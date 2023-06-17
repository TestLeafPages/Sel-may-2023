package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text()='Show']")).click(); //first alert box
		 
		Alert a = driver.switchTo().alert();
	    System.out.println(a.getText());
		a.accept();		
		//confirmation box
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();//second show button (Confirm dialog)
		System.out.println(a.getText());
		a.dismiss();
		
		//Sweet alert/Non modal alert
		
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		//a.accept(); not applicable
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();

		//click the Prompt box
		//switch to alert
		//a.sendKeys("Vidya")
		//accppt/dismiss
		
		
		
		
	}

}
