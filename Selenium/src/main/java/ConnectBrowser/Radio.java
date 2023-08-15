package ConnectBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) throws Exception {


		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		
WebElement wb3=driver.findElement(By.xpath("//label[text()='Male']"));
	
Thread.sleep(2000);

wb3.click();
		
}
}
