package SeleniumPractice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LetsKodeItPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/adnahmed/Documents/EclipseWorkspace/SeleniumPractice/geckodriver");

		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
				
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.manage().window().maximize();
		//radio button example
		driver.findElement(By.xpath("//*[@id='bmwradio']")).click();
		driver.findElement(By.xpath("//*[@id='benzradio']")).click();
		driver.findElement(By.xpath("//*[@id='hondaradio']")).click();
		System.out.println("Successfully opened the LetsKodeIt page and clicked on all the three radio buttons");
		
		//drop down example , we use SELECT class for drop-down
		WebElement dropdown = driver.findElement(By.id("carselect"));
		Select drop = new Select(dropdown);
		drop.selectByVisibleText("BMW");
		wait.withTimeout(50, TimeUnit.SECONDS);
		
	//-->This is implicit wait which occurs in the DOM (Document Object Model)
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		drop.selectByVisibleText("Benz");
	
		drop.selectByVisibleText("Honda");
		driver.close();
		
		
		

	}

}
