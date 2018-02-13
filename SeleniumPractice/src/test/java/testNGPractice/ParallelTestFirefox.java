package testNGPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class ParallelTestFirefox {
	WebDriver driver = new FirefoxDriver();
	
	@BeforeTest
	  public void initializingfirefoxdriver() {
		System.setProperty("webdriver.gecko.driver", "/Users/adnahmed/Documents/EclipseWorkspace/SeleniumPractice/geckodriver");
		driver.get("https://letskodeit.teachable.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("successfully opened the page in firefox browser");
		driver.findElement(By.xpath("//*[@class='navbar-link fedora-navbar-link']")).click();
		
		
	  }
	
	
	
  @Test
  public void firefoxtest() {
		System.setProperty("webdriver.gecko.driver", "/Users/adnahmed/Documents/EclipseWorkspace/SeleniumPractice/geckodriver");

	  driver.findElement(By.id("user_email")).sendKeys("johnsmith954277@gmail.com");
		System.out.println("clicked on email and entered the email provided in firefoxbrowser");
		driver.findElement(By.id("user_password")).sendKeys("System1234");
		System.out.println("clicked on password and entered the email provided in firefoxbrowser");

		driver.findElement(By.name("commit")).click();
		System.out.println("clicked on login button in firefoxbrowser");
	  
	  
	  
	  
	  
  }
  

  @AfterTest
  public void afterTest() {
	  driver.close();
	  System.out.println("successfully closed the firefox browser");
  }

}
