package SeleniumPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iFrames {
	
	
	public static void main(String[] args) throws Exception{
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "/Users/adnahmed/Documents/EclipseWorkspace/SeleniumPractice/geckodriver");
		driver.manage().window().maximize();
		driver.get("file:///Users/adnahmed/Documents/EclipseWorkspace/HTML_Practice/iframe");
		driver.switchTo().frame("seleniumnews");
		System.out.println("successfully switched to seleniumnews frame");
		driver.findElement(By.xpath("//*[@title = 'Selenium Projects']")).click();
		System.out.println("Clicked on Projects");
		
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@href = 'http://learn-automation.com/']")).click();
		
		
		
		
	}
	
	
}
