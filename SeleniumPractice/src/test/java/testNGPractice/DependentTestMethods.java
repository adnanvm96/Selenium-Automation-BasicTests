package testNGPractice;



import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//In this we will see if the methods are dependent on each other then how they will be executed 


import org.testng.annotations.Test;

import referenceClassForTestNG.ClassUsedToReference;

public class DependentTestMethods {
	ClassUsedToReference object;  //We created a object of the other java class and imported from that package import org.testng.annotations.Test 
	
	
	
	@BeforeClass
	public void setUp() {
		object = new ClassUsedToReference();
		System.out.println("before class");
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("after class");
	}
	
	@Test(dependsOnMethods={ "testMethod2" }, alwaysRun=true)   //even though this test fails and it is dependent on other tests it wont be skipped when we use " alwaysRun=true"
	//if we remove this alwaysRun=true then we can see that the test which is dependent on "testMethod2" will be skipped 
	public void testMethod1() {
		System.out.println("testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("testMethod2");
		int result = object.sumNumbers(1, 2);
		Assert.assertEquals(result, 2);
	}
	
	@Test(dependsOnMethods={ "testMethod1" })
	public void testMethod3() {
		System.out.println("testMethod3");
	}
	
	@Test
	public void testMethod4() {
		System.out.println("testMethod4");
	}
}
