package SeleniumPractice;


import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver driver = new FirefoxDriver();
		
		//driver.get("https://www.google.com/"); // this is the regular method we follow to open website
		
	Navigation navigator = driver.navigate();
	navigator.to("https://www.google.com/");
	navigator.to("https://www.yahoo.com/");
	
	navigator.back();
	navigator.forward();
	navigator.refresh();
	driver.close();
		

	}

}
