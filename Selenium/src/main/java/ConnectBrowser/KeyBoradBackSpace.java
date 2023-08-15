package ConnectBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoradBackSpace {

	public static void main(String[] args) throws Exception {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");
		
		
		WebElement wb=driver.findElement(By.name("email"));
		wb.sendKeys("SeleniumT");
		
		
		Actions act = new Actions(driver);

			act.click(wb).keyDown(Keys.BACK_SPACE).keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		
		
		

	}

}
