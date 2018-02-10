package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextAndPartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/Users/adnahmed/Documents/EclipseWorkspace/SeleniumPractice/chromedriver");
		driver.get("https://letskodeit.teachable.com/");
		//A link text has to be inside the <a  /a> tag followed by href
		driver.findElement(By.linkText("Login")).click();
		System.out.println("Clicked on th login link");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Pract")).click();
		
		//It is not a good idea to find the element either by link text or partial link text but 
		//we can find them by xpath,id,name.
		

	}

}