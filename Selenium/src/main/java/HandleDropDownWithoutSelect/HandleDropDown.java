package HandleDropDownWithoutSelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.findElement(By.name("country")).click();
		
		List<WebElement>ls=driver.findElements(By.xpath("//select[@name='country']/option"));
		
		//for(WebElement abc:ls)
		
		for(WebElement abc:ls)
		{
			String xyz=abc.getText();
			System.out.println(xyz);
			
			if(xyz.contentEquals("ANTARCTICA"))
			{
				abc.click();
				break;
			}
		}

	}

}
