package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContainsSiblingsAncestorFuntions {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "/Users/adnahmed/Documents/EclipseWorkspace/SeleniumPractice/geckodriver");
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		//contains function
		driver.findElement(By.xpath("//h4/a[contains(text(),'SAP MM')]"));
		//Siblings function
		

	}

}
