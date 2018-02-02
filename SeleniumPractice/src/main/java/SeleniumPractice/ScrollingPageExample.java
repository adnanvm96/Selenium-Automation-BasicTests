package SeleniumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollingPageExample {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "/Users/adnahmed/Documents/EclipseWorkspace/SeleniumPractice/geckodriver");
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		

	}

}