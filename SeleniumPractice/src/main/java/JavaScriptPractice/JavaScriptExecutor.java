package JavaScriptPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "/Users/adnahmed/Documents/EclipseWorkspace/SeleniumPractice/geckodriver");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('welcome to google');");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Alert ale = driver.switchTo().alert();
	    ale.accept();
	    ((JavascriptExecutor)driver).executeScript("window.open();");
	    driver.get("https://www.yahoo.com/");
	    //driver.close();
	}

}
