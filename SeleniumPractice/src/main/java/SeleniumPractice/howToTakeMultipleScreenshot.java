package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import library.Utility;

public class howToTakeMultipleScreenshot {
	
	public static void main(String[] args) throws Exception {
		//Exception is a base class
		System.setProperty("webdriver.gecko.driver", "/Users/adnahmed/Documents/EclipseWorkspace/SeleniumPractice/geckodriver");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		Utility.captureScreenshot(driver, "BrowserStarted2");
	
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("nisum");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("//*[@href='http://www.nisum.com/']")).click();
		Utility.captureScreenshot(driver, "Nisumscreenshot2");
		
		System.out.println("Captured Screenshot");
		
	}
		
}
	
		

	
