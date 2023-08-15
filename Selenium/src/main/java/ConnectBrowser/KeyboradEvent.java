package ConnectBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboradEvent {

	public static void main(String[] args) {

		// KeyDown() : it is used to press modifier key
		// This method present inside the actions class and return type is actions class

		// sendKeys() : It is used to send keys to Element
		// This method present inside the actions class and return type is actions class

		// KeyUp() : It is used to release the press key
		// This method present inside the actions class and return type is actions class

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");
		
		
		WebElement wb=driver.findElement(By.name("email"));
		
		Actions act = new Actions(driver);

		act.keyDown(Keys.SHIFT).sendKeys(wb,"Sagar Atpdkar").build().perform();
		
		

	}
}
