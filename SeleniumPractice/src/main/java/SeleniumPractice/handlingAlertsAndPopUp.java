package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingAlertsAndPopUp {

	
	
	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver", "/Users/adnahmed/Documents/EclipseWorkspace/SeleniumPractice/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://selenium-webdriver.com/java/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@name='alert']")).click();
		Alert ale = driver.switchTo().alert();
		ale.accept();
		System.out.println("Successfully clicked on OK alert-box");
		driver.findElement(By.xpath("//*[@name='alert']")).click();
		ale.dismiss();
		System.out.println("successfully cancelled the alert-box");
		driver.findElement(By.xpath("//*[@name='confirmation']")).click();
		ale.dismiss();
		System.out.println("successfully cancelled the popup-box");
		driver.findElement(By.xpath("//*[@name='confirmation']")).click();
		ale.accept();
		System.out.println("Successfully clicked on OK popup-box");
		driver.findElement(By.xpath("//*[@name='prompt']")).click();
		ale.sendKeys("google");
		ale.accept();
		System.out.println("Successfully clicked on propmt-box and sent the keys (google)");
		opennewtab(driver);
	}
		
	public static void opennewtab(WebDriver driver){
		Actions act = new Actions(driver);
		act.sendKeys(Keys.COMMAND + "t").build().perform();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//*[@name='cusid']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@name='submit']")).click();
		Alert aler = driver.switchTo().alert();
		aler.accept();
		aler.accept();
		
	}
		
		
}
		
		
		
		
		
		
		
	
	
	
	
