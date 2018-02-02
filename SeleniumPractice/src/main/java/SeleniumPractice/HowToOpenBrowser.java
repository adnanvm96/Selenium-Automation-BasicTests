package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HowToOpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a new instance of the Firefox driver
		System.setProperty("webdriver.gecko.driver", "/Users/adnahmed/Documents/EclipseWorkspace/SeleniumPractice/geckodriver");

        WebDriver driver = new FirefoxDriver();
        
       // WebElement ele = null;
       
		
        //Launch the Online Store Website
		driver.get("http://www.tabletennis11.com/other_eng/");
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website http://www.tabletennis11.com/other_eng/");
		
        //maximise window
        driver.manage().window().maximize();
        
        //click on product
        
        driver.findElement(By.xpath("//*[@title = 'View All Special Offers']")).click();
        driver.close();

	}

}
