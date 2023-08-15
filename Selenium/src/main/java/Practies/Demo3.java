package Practies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement wb1=driver.findElement(By.name("q"));
		wb1.sendKeys("pushpa movie");
		
		WebElement wb2=driver.findElement(By.name("btnK"));
		wb2.click();
		
		WebElement wb3=driver.findElement(By.xpath("//span[text()='17 December 2021 (']"));
		String releasedate=wb3.getText();
		
		driver.navigate().back();
		

	}

}
