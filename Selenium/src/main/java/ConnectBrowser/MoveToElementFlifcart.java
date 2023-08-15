package ConnectBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementFlifcart {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		

		WebElement wb=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		WebElement wb1=driver.findElement(By.xpath("//span[text()='Your Orders']"));
		
		
		
		Actions act = new Actions(driver);

		act.moveToElement(wb).click(wb1).build().perform();
		
		
		
		
	}

}
