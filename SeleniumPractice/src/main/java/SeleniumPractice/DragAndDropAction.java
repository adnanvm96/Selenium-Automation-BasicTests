package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "/Users/adnahmed/Documents/EclipseWorkspace/SeleniumPractice/geckodriver");
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		WebElement dragme1 = driver.findElement(By.xpath("//*[@id='box1']"));
		WebElement dropme1 = driver.findElement(By.xpath("//*[@id='box101']"));
		//Actions is a class which is used for performing the user interactions such as click,double click,right click,drag and drop etc
		
		WebElement dragme2 = driver.findElement(By.xpath("//*[@id='box2']"));
		WebElement dropme2 = driver.findElement(By.xpath("//*[@id='box102']"));
		
		WebElement dragme3 = driver.findElement(By.xpath("//*[@id='box3']"));
		WebElement dropme3 = driver.findElement(By.xpath("//*[@id='box103']"));
		
		WebElement dragme4 = driver.findElement(By.xpath("//*[@id='box4']"));
		WebElement dropme4 = driver.findElement(By.xpath("//*[@id='box104']"));
		
		WebElement dragme5 = driver.findElement(By.xpath("//*[@id='box5']"));
		WebElement dropme5 = driver.findElement(By.xpath("//*[@id='box105']"));
		
		WebElement dragme6 = driver.findElement(By.xpath("//*[@id='box6']"));
		WebElement dropme6 = driver.findElement(By.xpath("//*[@id='box106']"));
		
		WebElement dragme7 = driver.findElement(By.xpath("//*[@id='box7']"));
		WebElement dropme7 = driver.findElement(By.xpath("//*[@id='box107']"));
		
		
		
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(dragme1, dropme1).perform();
		act.dragAndDrop(dragme2, dropme2).perform();
		act.dragAndDrop(dragme3, dropme3).perform();
		act.dragAndDrop(dragme4, dropme4).perform();
		act.dragAndDrop(dragme5, dropme5).perform();
		act.dragAndDrop(dragme6, dropme6).perform();
		act.dragAndDrop(dragme7, dropme7).perform();
		
		
		
		
	}

}
