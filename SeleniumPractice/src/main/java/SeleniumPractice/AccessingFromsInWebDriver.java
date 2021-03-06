package SeleniumPractice;
//accessing forms in selenium and handling dropdowns

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AccessingFromsInWebDriver {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "/Users/adnahmed/Documents/EclipseWorkspace/SeleniumPractice/geckodriver");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("http://demoqa.com/registration/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@id='name_3_firstname']")).sendKeys("John");
    driver.findElement(By.xpath("//*[@id='name_3_lastname']")).sendKeys("smith");
    driver.findElement(By.xpath("//*[@value='single']")).click();
    driver.findElement(By.xpath("//*[@value='cricket ']")).click();
    //For dropdown we use SELECT class 
    Select countrydropdown = new Select(driver.findElement(By.id("dropdown_7")));
    countrydropdown.selectByValue("United States");
    Select monthdropdown = new Select(driver.findElement(By.id("mm_date_8")));
    monthdropdown.selectByValue("7");
    Select daydropdown = new Select(driver.findElement(By.id("dd_date_8")));
    daydropdown.selectByValue("21");
    Select yeardropdown = new Select(driver.findElement(By.id("yy_date_8")));
    yeardropdown.selectByValue("1993");
    driver.findElement(By.id("phone_9")).sendKeys("1234567890");
    driver.findElement(By.id("username")).sendKeys("johnsmith954277");
    driver.findElement(By.id("email_1")).sendKeys("johnsmith954277@gmail.com");
    driver.findElement(By.id("description")).sendKeys("Google LLC[5] is an American multinational technology company that specializes in Internet-related services and products, which include online advertising technologies, search engine, cloud computing, software, and hardware.");
    driver.findElement(By.id("password_2")).sendKeys("123456@123$");
    driver.findElement(By.id("confirm_password_password_2")).sendKeys("123456@123$");
    
    
    
    
    
    
    
    
	}

	
		
	
	
}
