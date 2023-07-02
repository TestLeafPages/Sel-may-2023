package week5.day1;

import org.testng.annotations.Test;

public class LearnDependency {
	
	
	@Test
	public void createLead() {
		System.out.println("CreateLead testcase");
		throw new RuntimeException("Chk the locator");
	}
	
	
	@Test(priority=-1,dependsOnMethods="createLead",alwaysRun=true)
	public void EditLead() {
		System.out.println("Edit testcase");
	}
	
	
	@Test(dependsOnMethods="EditLead")
	public void DeleteLead() {
		System.out.println("Delete testcase");
	}

	
	
	
	
}
