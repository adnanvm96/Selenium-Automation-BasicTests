package testNGPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNGSuitePractice1 {
	@BeforeClass //It runs before class once 
	public void apple(){
		 System.out.println("TestNGSuitePractice1-->This is before class and it runs before the test starts");
		
	}
	
  @BeforeMethod   //It runs before every method i.e., in our case before 'first test' and 'second test'
  public void beforeMethod() {
	  System.out.println("TestNGSuitePractice1-->This is before method and it runs before every test case");
	  
  }
  @Test   //This is first test 
  public void method1() {
	  System.out.println("TestNGSuitePractice1-->This is method1");
	  
	  
  }
  @Test   //this is second test
  public void method2() {
	  System.out.println("TestNGSuitePractice1-->This is method2");
	  
	  
	  
  }
  @AfterClass
  public void orange(){
	  
		 System.out.println("TestNGSuitePractice1-->This is after class and it runs after the test starts");

	  
  }

  @AfterMethod       //It runs after every method i.e., in our case after 'first test' and 'second test'
  public void afterMethod() {
	  System.out.println("TestNGSuitePractice1-->This is after method and it runs after every test case");
	  
  }
}