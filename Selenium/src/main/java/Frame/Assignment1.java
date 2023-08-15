package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	/* Enter topic as API Automation		
	select the avatar from drop down
	select the checkbox 
	select the cat from drop down
	unselect the checkbox 
	clear the topic and enter UI Automation */
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.switchTo().frame("frame1");
		
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("Sagar");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		
		WebElement wb=driver.findElement(By.id("animals"));
		
		Select sel=new Select(wb);
		sel.selectByVisibleText("Avatar");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		
		driver.findElement(By.xpath("//input[@id='a']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		
		WebElement wb1=driver.findElement(By.id("animals"));
		Select sel1=new Select(wb1);
		sel1.selectByVisibleText("Cat");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		
		driver.findElement(By.xpath("//input[@id='a']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame1");
		
		WebElement wb2=driver.findElement(By.xpath("(//input)[1]"));
		wb2.clear();
		wb2.sendKeys("UI Automation");

	}

}
