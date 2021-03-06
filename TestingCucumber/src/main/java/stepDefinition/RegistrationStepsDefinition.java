package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class RegistrationStepsDefinition {
	
	
	WebDriver driver = new FirefoxDriver();
	
			
	@Given("^User goes to http://demoqa\\.com/registration/$")
	public void GotoRegistrationPage() throws Throwable {
	    
	    driver.get("http://demoqa.com/registration/");
	    
	}
	    
	//Passing one dimensional datatset
	
	@When("^User fills in the given details registration form$")
	public void FillTheForm(DataTable testData) throws Throwable {
		
		List<String> testDataAsList = testData.asList(String.class);
		
		System.out.println(testDataAsList.toString());
		driver.findElement(By.id("name_3_firstname")).sendKeys(testDataAsList.get(0));
		driver.findElement(By.id("name_3_lastname")).sendKeys(testDataAsList.get(1));
		driver.findElement(By.id("phone_9")).sendKeys(testDataAsList.get(2));
		driver.findElement(By.id("username")).sendKeys(testDataAsList.get(3));
		
		
		
	}
	   
	    
	    

	
}
