package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import library.Utility;

public class howToTakeMultipleScreenshot {
	
	public static void main(String[] args) throws Exception {
		//Exception is a base class
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Utility.captureScreenshot(driver, "BrowserStarted");
	
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("nisum");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("//*[@href='http://www.nisum.com/']")).click();
		Utility.captureScreenshot(driver, "Nisumscreenshot");
		
		System.out.println("Captured Screenshot");
		
		
	}
	
}
		

	