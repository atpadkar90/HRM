package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.id("singleframe"));
		
		driver.switchTo().frame(0);
		

		WebElement wb=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		wb.sendKeys("sagar");
	}

}
