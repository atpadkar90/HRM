package Practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
		
		
		
	while(true)
		{
			//WebElement wb=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all ng-tns-c58-10']"));
			
			WebElement wb1=driver.findElement(By.xpath("//a[text()='June']"));
			WebElement wb2=driver.findElement(By.xpath("//span[text()='2023']"));
			
			
			
		//String ab=wb.getText();
			String ab1=wb1.getText();
			String ab2=wb2.getText();
			String c=ab1+ab2;
			System.out.println(c);
			
			if(c.contains("November2023"))
			{
				
				break;
				
			}
			
			{
				driver.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
				
			}
		}
	}
}
