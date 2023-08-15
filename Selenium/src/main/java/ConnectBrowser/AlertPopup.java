package ConnectBrowser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
//		driver.findElement(By.id("alertButton")).click();
//		
//	Alert alt=	driver.switchTo().alert();
//	
//String a=alt.getText();
//	
//	System.out.println(a);
//	alt.accept();
//	
//	Thread.sleep(2000);
	
	driver.findElement(By.id("promtButton")).click();
	
	Alert at1=driver.switchTo().alert();
	
	String b=at1.getText();
	
	System.out.println(b);
	
	at1.sendKeys("Sagar");
	

	at1.accept();
	
	Thread.sleep(2000);
	
	WebElement wb=driver.findElement(By.id("promptResult"));
	
System.out.println(wb.getText());
	
	
	}

}
