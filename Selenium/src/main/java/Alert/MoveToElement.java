package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws Exception {
		
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		
		Thread.sleep(5000);
		
		WebElement wb=driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
		
		Actions act= new Actions(driver);
		///act.click(wb).build().perform();
		act.moveToElement(wb, 1, 2).perform();
		
		
		WebElement wb1=driver.findElement(By.xpath("//a[text()='Laptop and Desktop']"));
		
		Actions act1= new Actions(driver);
		act1.moveToElement(wb1).build().perform();
		
WebElement wb2=driver.findElement(By.xpath("//a[text()='Laptops']"));
		
		Actions act2= new Actions(driver);
		act2.click(wb2).build().perform();
		
		act2.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).build().perform();

	
		
	}

}
