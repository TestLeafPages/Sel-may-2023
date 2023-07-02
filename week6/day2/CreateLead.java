package week5.day1;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{

	@BeforeTest
	public void setValues() {
		filename ="Leads";
		shName="CreateLead";
	}
		
	//attributes is to set values at the @Test 	
	@Test(dataProvider="sendData",invocationCount=2)
	public void runCreate(String cname,String fname,String lname,String phno) {		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();
}
	
	//1 Tc --> 4 datas
	//2testdata -->1 -->2times
	//2-->2 times
	//4 datas
	
	
	
	
	
	
	
	//create a two dimensional array
	//	String[][] data=new String[2][4];
		
		/*
		 * data[0][0]="TL"; data[0][1]="Vidya"; data[0][2]="R"; data[0][3]="99";
		 * 
		 * 
		 * data[1][0]="TCS"; data[1][1]="Nilofer"; data[1][2]="Nisha"; data[1][3]="99";
		 * 
		 */	
		
		/*
		 * ReadExcelData values=new ReadExcelData(); values.readData();
		 */
		/*
		 * String[][] readData = ReadExcelData.readData(); return readData;
		 */
	
	//static is a keyword and represented as class variable -->call the methods/variables directly without creating obj 
	//shares one single memory across the class
	
	
	
	
}






