package ConnectBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Congmovetoelement {

	public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//			driver.manage().window().maximize();
//			driver.manage().deleteAllCookies();
			driver.get("https://ui.cogmento.com/");
			
			Thread.sleep(3000);
			 driver.findElement(By.name("email")).sendKeys("sagar.atpadkar90@gmail.com"); 
			 driver.findElement(By.name("password")).sendKeys("Handelawns@412308"); 
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//div[text()='Login']")).click();
			
			 
//			 WebElement wb=driver.findElement(By.xpath("//div[@id='main-nav']"));
//				Actions act=new Actions(driver);
//				act.moveToElement(wb).build().perform();
			 
			String a= driver.getTitle();
			
			if(a.contains("CRM"))
			{
				System.out.println("Test Case is Pass");
			}
			
			String b=driver.getCurrentUrl();
			
			if(b.contains("cogmento"))
			{
				System.out.println("Test Case is Pass");
			}
			 
				Thread.sleep(3000);
				WebElement wb1=driver.findElement(By.xpath("//span[text()='Contacts']"));
				Actions act1=new Actions(driver);
				act1.click(wb1).build().perform();
				
	}

}
