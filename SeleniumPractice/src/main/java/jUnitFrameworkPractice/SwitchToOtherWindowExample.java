package jUnitFrameworkPractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToOtherWindowExample {
	WebDriver driver = new FirefoxDriver();
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/adnahmed/Documents/EclipseWorkspace/SeleniumPractice/geckodriver");
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
		
	@Test
	public void test() throws InterruptedException {
		// Get the handle
				String parentHandle = driver.getWindowHandle();
				System.out.println("Parent Handle: " + parentHandle);
		// Find Open Window button
				WebElement openWindow = driver.findElement(By.id("openwindow"));
				openWindow.click();
				// Get all handles
				Set<String> handles = driver.getWindowHandles();
				// Switching between handles
				for (String totalhandles: handles) {
					System.out.println(totalhandles);
					if (!totalhandles.equals(parentHandle)) {   // '!' means 'not'
						driver.switchTo().window(totalhandles);
						Thread.sleep(2000);
						WebElement searchBox = driver.findElement(By.id("search-courses"));
						searchBox.sendKeys("python");
						Thread.sleep(2000);
						driver.close();
						break;
					}
				}
				// Switch back to the parent window
				driver.switchTo().window(parentHandle);
				driver.findElement(By.id("name")).sendKeys("Test Successful");
			}
		
		
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.close();
		
	}
		
	
		
		
		
	


	

}
