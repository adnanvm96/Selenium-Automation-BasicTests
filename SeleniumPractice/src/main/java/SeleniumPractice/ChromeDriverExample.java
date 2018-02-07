package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/Users/adnahmed/Documents/EclipseWorkspace/SeleniumPractice/chromedriver");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("Successfully opened the Google Chrome Browser");
		driver.close();
	}

}
