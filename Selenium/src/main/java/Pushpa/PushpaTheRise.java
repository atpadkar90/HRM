package Pushpa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;


public class PushpaTheRise {
	public static WebDriver driver;
	
	public void googlePage(String name) throws Exception
	{
	
		WebElement wb1=driver.findElement(By.name("q"));
		wb1.sendKeys(name);
		
		WebElement wb2=driver.findElement(By.name("btnK"));
		wb2.click();
		
		WebElement wb3=driver.findElement(By.xpath("//span[text()='17 December 2021 (']"));
		String releasedate=wb3.getText();
		System.out.println(releasedate);
		  
		String []a=releasedate.split(" ");
		
		String c=a.toString();
				if(c.contains(releasedate))
					{
		System.out.println(c);
		
					}
		  
		  
//
//		WebElement wb4=driver.findElement(By.xpath("//h3[text()='Pushpa: The Rise - Part 1 (2021)']"));
//		wb4.click();
//		
//		WebElement wb5=driver.findElement(By.xpath("//a[text()='December 17, 2021 (United States)']"));
//		
//		String releasedate1=wb5.getText();
//		System.out.println(releasedate1);
//		
//		
//		if(a.equals("releasedate1"))
//		{
//			System.out.println("Test case is pass");
//		}
//		else
//		{
//			System.out.println("Test case is fail");
//	}
		
	}
	
	
	
	
	
	

	public static void main(String[] args) throws Exception {
		
		PushpaTheRise pushpa= new PushpaTheRise();
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		pushpa.googlePage("pushpa movie");
		
	}

}
