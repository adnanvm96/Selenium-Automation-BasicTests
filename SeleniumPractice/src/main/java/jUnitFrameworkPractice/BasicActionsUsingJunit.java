package jUnitFrameworkPractice;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicActionsUsingJunit {
	WebDriver driver = new FirefoxDriver();
	
	
	
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/adnahmed/Documents/EclipseWorkspace/SeleniumPractice/geckodriver");
		driver.get("https://letskodeit.teachable.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
	}
	@Test
	public void test() {
		driver.get("https://letskodeit.teachable.com/");
		System.out.println("Successfully opened the page");
		
		driver.findElement(By.xpath("//*[@class='navbar-link fedora-navbar-link']")).click();
		System.out.println("clicked on login button");
		driver.findElement(By.id("user_email")).sendKeys("johnsmith954277@gmail.com");
		System.out.println("clicked on email and entered the email provided");
		driver.findElement(By.id("user_password")).sendKeys("System1234");
		System.out.println("clicked on password and entered the email provided");

		driver.findElement(By.name("commit")).click();
		System.out.println("clicked on login button");

	}
	
	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	

}
