package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setup the driver -ctrl shift o
				ChromeDriver driver=new ChromeDriver();
				//load the url
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				//maximize the screen
				driver.manage().window().maximize();	
				
				//identify the username input box(text box)
				//find the ele( textbox) -->using attribute-->enter text
				//unique value -->first prefered locator-->id
				//name
				//classname
				WebElement username = driver.findElement(By.id("username"));
				username.sendKeys("demoSalesManager");		
				//sendKeys-->enter the value in the text box
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				//click on login button
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//black text with <a>
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				driver.findElement(By.linkText("Leads")).click();
				
				driver.findElement(By.linkText("Create Lead")).click();
				
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
				
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
				
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
				//to handle dropdown
				//locate the element
				WebElement sourceEle = driver.findElement(By.id("createLeadForm_dataSourceId"));
				
				//Instantiate the Select class 
				Select source =new Select(sourceEle);				
				source.selectByIndex(1);				
				//uses the values from the value attribute
				source.selectByValue("LEAD_EMPLOYEE");				
				//using visibleText-->black text
				source.selectByVisibleText("Word of Mouth");
				
				//different 
			    Select mc=new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));				
				mc.selectByValue("CATRQ_AUTOMOBILE");
				
				
               String title = driver.getTitle();
               System.out.println(title);

				
				
			
	}

}
