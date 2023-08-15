package Windows;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("fname")).sendKeys("Sagar");
		driver.findElement(By.name("lname")).sendKeys("ABC");
		
		String parentid=driver.getWindowHandle();
		
		System.out.println(parentid);
		
		driver.findElement(By.linkText("Visit Facebook")).submit();
		
		Set<String>allwindow=driver.getWindowHandles();
		String facebookId="";
		for(String abc:allwindow) {
			
			if(!abc.equals(allwindow))
			{
				facebookId=abc;
			}
		}
		
		driver.switchTo().window(facebookId);
		driver.findElement(By.name("firstname")).sendKeys("PQR");
		driver.findElement(By.name("lastname")).sendKeys("ABC");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File(System.getProperty("user.dir")+"\\Screenshot\\"+"fb.jpg"));
		driver.switchTo().window(parentid);
		
		driver.findElement(By.name("address")).sendKeys("XYZ");
		
		

	}

}
