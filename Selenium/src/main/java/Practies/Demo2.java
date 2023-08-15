package Practies;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws Exception {


		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("guru99 demo tours");
		
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		String google=driver.getWindowHandle();
		
		System.out.println(google);
		Thread.sleep(2000);
				
		
		driver.findElement(By.xpath("//h3[text()='https://demo.guru99.com/test/newtours/']")).click();

		Set<String>allwindow=driver.getWindowHandles();
		
		String guru99="";
		
		for(String abc:allwindow)
		{
			if(!abc.equals(google))
			{
				guru99=abc;
			}
		}
		driver.switchTo().window(guru99);
		
		Thread.sleep(2000);
		
		driver.switchTo().window(google);
		

	}

}
