package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AccessingFromsInWebDriver {

	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/gmail/about/#");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@class = 'gmail-nav__nav-link gmail-nav__nav-link__sign-in']")).click();
    driver.findElement(By.xpath("//*[@type = 'email']")).sendKeys("california4fremont");
    driver.findElement(By.id("next")).click();
    driver.findElement(By.id("Passwd")).sendKeys("wordpass123");
    driver.findElement(By.xpath("//*[@class= 'RveJvd snByac']")).click();
	}

}
