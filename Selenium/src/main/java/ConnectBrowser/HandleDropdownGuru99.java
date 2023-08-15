package ConnectBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownGuru99 {

	public static void main(String[] args) {
		
		//1.Up Casting concept
		
		WebDriver driver=new ChromeDriver();
		
		//2.Open Guru99 url
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
	List<WebElement> wb=	driver.findElements(By.name("country"));
		
//		Select sel= new Select(wb);
//		
//		sel.selectByVisibleText("INDIA");
//		
//		WebElement wb1=sel.getFirstSelectedOption();
//		
//		System.out.println(wb1.getText());
//		System.out.println("****************");
//		
//		List<WebElement> ls=sel.getOptions();
		
//		int a=ls.size();
//		System.out.println(a);
//		System.out.println("****************");
		
		for(WebElement abc:wb)
		{
			
			String ab =abc.getText();	
			
			if(abc.getText().contains("INDIA"))
			{
			
				abc.click();
			
			}
		

	}
	}
}
