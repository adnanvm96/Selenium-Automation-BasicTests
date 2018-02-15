package testNGPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersInTestNG {
	
	
	@DataProvider (name = "inputs")
	public Object [][] toGetData() {
		return new Object [][]{
			{"bmw", "x5" },
			{ "audi", "A6"},
			{"mercedes", "c300"}
			
		};
		
		
	}
	
	
	
  @Test(dataProvider="inputs")
  public void testMethod1(String input1, String input2) {
	  
	  System.out.println("Input 1 is ==>" + input1);
	  System.out.println("Input 2 is ==>" + input2);

	  
	  
	  
	  
  }
  
  
  
  
}
