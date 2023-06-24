package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Leaftaps {
	@Test
	public void testcase() {
		System.out.println("TestCase");
	}
	
	
	@BeforeClass
	public void beforeMethod() {
		System.out.println("Leaftaps: beforeMethod");

	}

	

}
