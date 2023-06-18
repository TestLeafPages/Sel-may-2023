package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();		
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//find the table
		WebElement table = driver.findElement(By.xpath("//table[@role='grid']"));
		
		//using table -->find the rows count
		List<WebElement> row = table.findElements(By.tagName("tr"));
		System.out.println(row.size());
		
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@role='grid']/thead/tr/th"));
		System.out.println(col.size());
		
		//header information
		String text = driver.findElement(By.xpath("//table[@role='grid']/thead/tr/th[1]/span")).getText();
		System.out.println(text);
		
		
		//real data
		List<WebElement> tbody = table.findElements(By.xpath("//table[@role='grid']/tbody/tr"));
		System.out.println("No. of rows in tbody : "+tbody.size());
		
		
		String text2 = table.findElement(By.xpath("//table[@role='grid']//tr[2]/td[3]")).getText();
		System.out.println(text2);
		
		System.out.println("*********************************");
		
		//get the data from all the rows of first col ->id
		for(int i=1;i<=tbody.size();i++) {
			String firstColData = table.findElement(By.xpath("//table[@role='grid']//tr["+i+"]/td[1]")).getText();
            System.out.println(firstColData);
		}
		

		System.out.println("*********************************");
		
		//get the data from all the col values of first row 
		
		for(int i=1;i<=col.size();i++) {
			String firstrowData = table.findElement(By.xpath("//table[@role='grid']//tr[1]/td["+i+"]")).getText();
            System.out.println(firstrowData);
		}
		
		System.out.println("*********************************");
		//to retreive all the datas from the table
		
		for(int i=1;i<=tbody.size();i++) {
			for(int j=1;j<=col.size();j++) {
				String allData = table.findElement(By.xpath("//table[@role='grid']//tr["+i+"]/td["+j+"]")).getText();
	            System.out.print(allData +" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
