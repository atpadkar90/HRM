package ConnectBrowser;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) throws IOException {
		
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://unifiedportal-mem.epfindia.gov.in/memberinterface/");
		
		List<WebElement>ls=driver.findElements(By.tagName("a"));
		
     TakesScreenshot ts=(TakesScreenshot)driver;
		
		File f=ts.getScreenshotAs(OutputType.FILE);
		
		File des=new File(System.getProperty("user.dir")+"//Screenshott//"+"pqr.jpg");
		
		FileUtils.copyFile(f, des);
		
		System.out.println(ls.size());
		
		for(int i=0;i<ls.size();i++)
		{
			String wb=ls.get(i).getText();
			System.out.println(wb);
		}
	
		
		
	}
	

}
