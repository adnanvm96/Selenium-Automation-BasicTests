package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/adnahmed/Documents/EclipseWorkspace/SeleniumPractice/geckodriver");

		WebDriver driver = new FirefoxDriver();
		//Radio button 
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		
		List<WebElement> radiobuttons=driver.findElements(By.xpath("//*[@type='radio' and @name='lang']"));
		for (int i=0;i<radiobuttons.size();i++){
			
			WebElement local_radio = radiobuttons.get(i);
			String value =local_radio.getAttribute("value");
			
			System.out.println("Value from radio buttons are ======>>>>"+value);
			if(value.equalsIgnoreCase("RUBY")){
				
				local_radio.click();	
			}	
		}
		//Checkbox 
		
		List<WebElement> checkbox=driver.findElements(By.xpath("//*[@type='checkbox' and @name='lang']"));
		for(int i=0;i<checkbox.size();i++){
			WebElement ele = checkbox.get(i);
			String id = ele.getAttribute("id");
		
			System.out.println("Value of the checkboxes are ====>>"+ id);
			if(id.equalsIgnoreCase("code")){
				ele.click();
				break;
			}	
		}
		
		driver.close();
	}

}
