package Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {

	public static void main(String[] args) throws Exception {

WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
		//Thread.sleep(5000);
		while(true)
		{
			WebElement wb=driver.findElement(By.xpath("//span[text()='June']"));
			
			WebElement wb1=driver.findElement(By.xpath("//span[text()='2023']"));
			
			
			String ab=wb.getText();
			String ab1=wb.getText();
			String c=ab+ab1;
			
			if(c.contains("October 2023"))
			{
				
				break;
				
				
			}
			
			else
			{
				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all ng-tns-c58-10 ng-star-inserted']")).click();
			}
			
//			WebElement wb1=driver.findElement(By.xpath("(//a[contains(@class,'ui-state-default ng-tns-c58-10 ng-star-inserted')])[21]"));
//			
//			String abc=wb1.getText();
//			System.out.println(abc);
//			
		}

	}


}
