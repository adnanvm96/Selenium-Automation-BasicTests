package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class RegistrationStepsDeginition2 {
	
	WebDriver driver = new FirefoxDriver();
	
	@Given("^User goes to http://demoqa\\.com/registration/$")
	public void GotoRegistrationPage() throws Throwable {
	    
	    driver.get("http://demoqa.com/registration/");
	    
	}
	    
	//Passing two dimensional datatset, advantage of this datatset is that the feature file needs not be in order
	
	@When("^User fills in the given details registration form$")
	public void FillTheForm(DataTable testData) throws Throwable {
		
		Map<String, String>testDataAsMap = testData.asMap(String.class, String.class);
		
		
		driver.findElement(By.id("name_3_firstname")).sendKeys(testDataAsMap.get("First Name"));
		driver.findElement(By.id("name_3_lastname")).sendKeys(testDataAsMap.get("Last Name"));
		driver.findElement(By.id("phone_9")).sendKeys(testDataAsMap.get("Phone Number"));
		driver.findElement(By.id("username")).sendKeys(testDataAsMap.get("Username "));
		
		System.out.println(testDataAsMap.toString());
		
	}
	
	

}
