package KeyboradEventGuru99;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class GURU99 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		

		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement wb=driver.findElement(By.name("firstName"));
		WebElement wb1=driver.findElement(By.name("submit"));
		
		
		//wb.sendKeys("ABC");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		
		act.click(wb).sendKeys("ABCD").keyDown(Keys.BACK_SPACE).
		keyDown(Keys.TAB).
		sendKeys("PQR").
		keyUp(Keys.TAB).
	
		keyDown(Keys.TAB).
	    sendKeys("1234567891").keyDown(Keys.BACK_SPACE).
	    keyUp(Keys.TAB).
		
		keyDown(Keys.TAB).
		sendKeys("ABCr@gmail.com").
		keyUp(Keys.TAB).
		
		keyDown(Keys.TAB).
		sendKeys("Hadapsar").
		keyUp(Keys.TAB).
		
		keyDown(Keys.TAB).
		sendKeys("Pune").
		keyUp(Keys.TAB).
		
		keyDown(Keys.TAB).
		sendKeys("MH").
		keyUp(Keys.TAB).
		
		keyDown(Keys.TAB).
		sendKeys("411028").
		keyUp(Keys.TAB).
		
		
		
		keyDown(Keys.TAB).
		sendKeys("INA").
		keyUp(Keys.TAB).
		
		keyDown(Keys.TAB).
		sendKeys("ABC@tcs.com").
		keyUp(Keys.TAB).
		
		keyDown(Keys.TAB).
		sendKeys("Sagar123").
		keyUp(Keys.TAB).
		
		keyDown(Keys.TAB).
		sendKeys("Sagar123").
		keyUp(Keys.TAB).
		
		keyDown(Keys.TAB).
		click(wb1).
		//keyUp(Keys.TAB).
		
		build().perform();
		
	}

}
