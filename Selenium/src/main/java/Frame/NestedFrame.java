package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) {
		
		/*1) switch to the iframe with an iframe and enter the first name

	2)switch to the single frame and enter the  last name

	3) switch to the iframe with an iframe and capture the entered name and clear the name and enter the new name

	4) switch to the single frame and capture the entered name and clear the name and enter the new name */
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		WebElement wb=driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		
		wb.click();
		
		
		WebElement wb1=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		driver.switchTo().frame(wb1);
		
		driver.switchTo().frame(0);
		
		WebElement wb2=driver.findElement(By.xpath("//input[@type='text']"));
		
		wb2.sendKeys("Sagar");
		
		driver.switchTo().defaultContent();
		
		
		WebElement wb3=driver.findElement(By.xpath("//a[text()='Single Iframe ']"));
		wb3.click();
		
		driver.switchTo().frame("singleframe");
		
		//WebElement wb4=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		
		
		WebElement wb5=driver.findElement(By.xpath("//input[@type='text']"));
		
		wb5.sendKeys("Atpadkar");
		
		driver.switchTo().defaultContent();
		wb.click();
		driver.switchTo().frame(wb1);
		
		driver.switchTo().frame(0);
		
//		driver.switchTo().frame(wb1);
//		driver.switchTo().frame(0);
        WebElement wb6=driver.findElement(By.xpath("//input[@type='text']"));
	   String name=wb6.getAttribute("value");
		System.out.println(name);
	wb6.clear();
	wb6.sendKeys("UI Testing");
	
	driver.switchTo().defaultContent();
	wb3.click();
		driver.switchTo().frame(0);
		
		System.out.println(wb5.getAttribute("value"));
		wb5.clear();
		wb5.sendKeys("Automation Testing");
	}

}
