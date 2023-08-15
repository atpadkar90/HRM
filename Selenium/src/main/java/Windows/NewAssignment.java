package Windows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
	List<WebElement> wb=driver.findElements(By.name("country"));
	
		for(WebElement abc:wb)
			
		{if(abc.getText().contains("INDIA"))
		{
			abc.click();
		}
		}

	}}
