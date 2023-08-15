package ParalleTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {
	
	
	@Test(priority = 1)
	public void google() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(10000);
		driver.findElement(By.linkText("Gmail")).click();
		driver.close();
	}

	@Test(priority = 2)
	public void facebook() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.name("firstname")).sendKeys("Rahul");
		Thread.sleep(10000);
		driver.close();
	}

	@Test(priority = 3)
	public void orangehrm() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(10000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.close();

	}


}
