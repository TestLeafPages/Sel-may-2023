package week5.day1;

import org.testng.annotations.Test;

public class NewTest {
	//Priority -->works with the @Test method 
	//cannot be configured at class level
	//it takes input as int -->lowest value will execute first
	//will the priority neg value-yes
	//enabled-->ignore completely from execution
 
 @Test(priority=4,enabled=false)
  public void test1() {
	  System.out.println("Test 1");
  }  
  
  @Test(priority=2,invocationCount=3,threadPoolSize=2,invocationTimeOut=1000 )
  public void test2() throws InterruptedException {
	  System.out.println(Thread.currentThread().getId());
	  Thread.sleep(6000);
	  System.out.println("Test 2");

  }
    
  @Test(priority=0)
  public void test3() {
	  System.out.println("Test 3");

  } 
  
  @Test(priority=0)
  public void test4() {
	  System.out.println("Test 4");

  }
}
