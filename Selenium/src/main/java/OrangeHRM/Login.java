package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	Thread.sleep(5000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[text()=\" Login \"]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text()='PIM']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()=' Add ']")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("firstName")).sendKeys("ABCd");
	driver.findElement(By.name("lastName")).sendKeys("PQRS");
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("(//div[@class='oxd-date-input'])[2]")).click();
	
//	driver.findElement(By.xpath("//ul[@class='oxd-calendar-selector']//following::div/p[text()='July']")).click();
//	driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-year-selected']/p[text()='2023']")).click();
//	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='oxd-calendar-date-wrapper'])[1]")).click();
//	
//	(//input[@class='oxd-input oxd-input--active'])[9]
	//ul[@class='oxd-calendar-selector']//following::div/p[text()='July']
	//li[@class='oxd-calendar-selector-year']/div/p[text()='2023']
	//div[@class='oxd-calendar-dates-grid']//following::div[@class='oxd-calendar-date --selected --today']
		
		

	}

}
