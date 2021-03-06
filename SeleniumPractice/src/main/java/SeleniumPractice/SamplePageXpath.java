package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SamplePageXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/adnahmed/Documents/EclipseWorkspace/SeleniumPractice/geckodriver");

WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		//This will wait for 3 seconds on the page before proceeding with the next step
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 
		
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("nisum");
		driver.findElement(By.xpath("//*[@value='Google Search']")).click();
		driver.findElement(By.xpath("//*[@href='http://www.nisum.com/']")).click();
		
		
		//driver.findElement(By.xpath("//a[text()='WHO WE ARE']"));
		WebElement WhoWeAre = driver.findElement(By.xpath("//a[text()='WHO WE ARE']"));
		HoverAndClick(driver, WhoWeAre, WhoWeAre );
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.findElement(By.xpath("//*[@href='#executives_anchor']")).click();
		
		
		}

		public static void HoverAndClick(WebDriver driver,WebElement Hover,WebElement Click ){
			
			Actions action = new Actions(driver);
			action.moveToElement(Hover).click(Click).build().perform();

	}

}
