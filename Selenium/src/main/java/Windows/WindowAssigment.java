package Windows;

import java.io.File;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowAssigment {

	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
	
		driver.manage().window().maximize();
		
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
		
		
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("ABC");
		driver.findElement(By.name("lastName")).sendKeys("DEF");
		driver.findElement(By.name("phone")).sendKeys("821456789");
		driver.findElement(By.name("userName")).sendKeys("ABCDEG@1234");
		
		driver.findElement(By.name("address1")).sendKeys("Pune");
		driver.findElement(By.name("city")).sendKeys("Pune");
		driver.findElement(By.name("state")).sendKeys("MH");
		driver.findElement(By.name("postalCode")).sendKeys("123456");
		
		WebElement wb=driver.findElement(By.name("country"));
		Select sel=new Select(wb);
		sel.selectByVisibleText("INDIA");
		
		driver.findElement(By.name("email")).sendKeys("ABC@gmail.com");
		driver.findElement(By.name("password")).sendKeys("ABC@123");
		driver.findElement(By.name("confirmPassword")).sendKeys("ABC@123");

		//driver.findElement(By.name("submit")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\Screenshot\\"+"rgisterpage.jpg"));
		
					
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		WebElement wb2=driver.findElement(By.xpath("(//b[contains(text(),' ABC')])[1]"));
		
		String aa=wb2.getText();
		System.out.println(aa);
				
		
		WebElement wb3=driver.findElement(By.xpath("//b[contains(text(),' user name is ABC@gmail.com')]"));
		String bb=wb3.getText();
		System.out.println(bb);
		
		
		Thread.sleep(2000);
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File src1=ts1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File(System.getProperty("user.dir")+"\\Screenshot\\"+"Homepage.png"));
		
			
		driver.switchTo().window(google);
		
//		WebElement wb4=driver.findElement(By.xpath("//textarea[text()='guru99 demo tours']"));
//		wb4.click();
//		String cc=wb4.getText();
//		System.out.println(cc);
//		
//		TakesScreenshot ts2=(TakesScreenshot)driver;
//		File src2=ts2.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src2, new File(System.getProperty("user.dir")+"\\Screenshot\\"+"rgisterpage.jpg"));
	}

}
