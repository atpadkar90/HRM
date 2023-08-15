package ArrayJavaFacebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;



public class FB {

	public static void main(String[] args) {
		
//		ChromeOptions opt= new 	ChromeOptions();
//
// 		opt.addArguments("--headless");
//		WebDriver driver = new ChromeDriver(opt);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/register");
		
		WebElement wb=driver.findElement(By.name("birthday_month"));
		

		Select sel = new Select(wb);
		List<WebElement>ls=sel.getOptions();
		for(WebElement abc:ls)
		{
			String a=abc.getText();
			
			//System.out.print(" "+a);
			
		int b=a.length();
		
		for(int j=b-1;j>=0;j--)
		{
			System.out.print(a.charAt(j));
		}
		System.out.println();
		System.out.println(" --");

		}
		
	}

}
