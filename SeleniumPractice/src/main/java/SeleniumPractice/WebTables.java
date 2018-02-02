package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;

//Handle WebTables and Calendar

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "/Users/adnahmed/Documents/EclipseWorkspace/SeleniumPractice/geckodriver");
		driver.manage().window().maximize();
		//driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.get("https://www.delta.com/");
		driver.findElement(By.xpath("//*[@id='departureDate']")).click();
		//static xpath it can be changed any time but we need to have dynamic path 
		//driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[4]/table/tbody/tr[1]/td[5]/a")).click();
		//Dynamic path 
//It will store all the web elements in the list		
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/table[1]//td"));
		//Now run a small for loop 
		
	int alldates =dates.size();
	for(int i=0;i<alldates;i++) {
		String date=dates.get(i).getText();
		if(date.equals("25"))
		{
		dates.get(i).click();
		break;
		}
		
	}
		
		

	}

}