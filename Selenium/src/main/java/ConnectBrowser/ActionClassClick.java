package ConnectBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassClick {

	public static void main(String[] args) throws Exception {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	//	WebElement wb=driver.findElement(By.xpath("(//input[@name='radioButton'])[1]"));
	//	WebElement wb=driver.findElement(By.xpath("//a[text()='Open Tab']"));
//		WebElement wb=driver.findElement(By.xpath("//button[text()='Mouse Hover']"));
		
		
//		Actions act= new Actions(driver);
		//act.click(wb).build().perform();
		//act.contextClick(wb).build().perform();
//		act.moveToElement(wb).build().perform();
		

driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Thread.sleep(5000);
WebElement wb = driver.findElement(By.id("box2"));
		
		Actions act =new Actions(driver);
		act.clickAndHold(wb).build().perform();
		
	}

}
