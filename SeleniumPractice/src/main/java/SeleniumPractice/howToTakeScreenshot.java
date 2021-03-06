package SeleniumPractice;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class howToTakeScreenshot {

	public static void main(String[] args) throws Exception {
		//Exception is a base class
		System.setProperty("webdriver.gecko.driver", "/Users/adnahmed/Documents/EclipseWorkspace/SeleniumPractice/geckodriver");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("nisum");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("//*[@href='http://www.nisum.com/']")).click();
		
		
		TakesScreenshot ts = (TakesScreenshot)driver; //created a object to take screenshot 
		//In the above step we created a object and interface since we cannot create an object with interface we gave "driver"
		File source = ts.getScreenshotAs(OutputType.FILE);  
		//now we are calling the object and mentioning the output type as file 
		FileUtils.copyFile(source, new File("./Screenshots/myfirstscreenshot2.png")); //here we are copying the file and storing at the desired path
	//Note:- '.' Dot operator means it will focus on the current working directory so in our case it will focus in SeleniumPractice project
		System.out.println("Captured Screenshot");
		
	}
		
}


