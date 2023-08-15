package ConnectBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassclick {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://prafpawar11.github.io/checkbox.html");
		Thread.sleep(5000);
	WebElement wb=	driver.findElement(By.name("Automation Testing"));
	WebElement wb1 =driver.findElement(By.name("Cucumber"));
	WebElement wb2=	driver.findElement(By.name("Java Script Executor"));
	
	Actions act=new Actions(driver);
	
	act.click(wb).click(wb1).click(wb2).build().perform();
	
	if(wb.isSelected()&&wb1.isSelected()&&wb2.isSelected())
	{
		System.out.println("Test case pass");
	}
	
	else
	{
		System.out.println("Test Caes fail");
	}
	}

}
