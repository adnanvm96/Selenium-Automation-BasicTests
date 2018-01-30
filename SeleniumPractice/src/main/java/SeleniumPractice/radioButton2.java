package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class radioButton2 {
	

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id = 'lst-ib']")).sendKeys("amazon");
		driver.findElement(By.xpath("//*[@value='Google Search']")).click();
		driver.findElement(By.xpath("//*[@id='vn1s0p1c0']")).click();
		WebElement Departments = driver.findElement(By.xpath("//*[@class='nav-a nav-a-2 nav-single-row-link']"));
		Hovering(driver, Departments);
		opennewtab(driver);
		 
		
	}

	public static void Hovering(WebDriver driver,WebElement Hover) {
		Actions action = new Actions(driver);
		action.moveToElement(Hover).build().perform();
		//action.click(driver.findElement(By.xpath("//*[@class='nav-a nav-a-2 nav-single-row-link']"))).moveToElement(Hover).build().perform();
		action.clickAndHold(driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/span[2]/span[@class='nav-text']"))).moveToElement(Hover).build().perform();
		action.clickAndHold(driver.findElement(By.xpath("/html//div[@id='nav-flyout-shopAll']//a[@href='/gp/dmusic/promotions/AmazonMusicUnlimited/ref=nav_shopall_dm_hf']/span[@class='nav-text']"))).click();
		
	}
		
		public static void opennewtab(WebDriver driver){
		Actions act = new Actions(driver);
		act.sendKeys(Keys.COMMAND + "t").build().perform();
		 driver.get("https://www.yahoo.com/");
		
		}	
			
		
}
			
			
			
		
		
	

	

