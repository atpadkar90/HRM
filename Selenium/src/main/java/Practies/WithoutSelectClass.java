package Practies;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSelectClass {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/reg");
		
		
		WebElement wb=driver.findElement(By.name("birthday_month"));
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='11'",wb);
		
		
//		wb.sendKeys("Nov");
//		wb.click();
		
//		List<WebElement>ls=driver.findElements(By.name("birthday_month"));
//		
//
//		for(int i=0;i<ls.size();i++)
//
//		{
//			String abc=ls.get(i).getText();
//			
//			
//			if(abc.contains("Nov"))
//			{
//				
//				Thread.sleep(2000);
//				ls.get(i).click();
//				break;
//			}
//			else
//			{
//				System.out.println("Tes case is fail");
//				
//			}
//		}
//		
//		
//		
		
		
//		for(WebElement abc:ls)
//		{
//			if(abc.getText().contains("Nov"))
//			{
//				System.out.println(abc.getText());
//				abc.click();
//			}
//			
//		}
		
	}

}
