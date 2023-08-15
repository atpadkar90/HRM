package Saucedemo;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws Exception {

		// Step 1: UP casting

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// Step 2; open a URL: https://www.saucedemo.com/inventory.html
		driver.get("https://www.saucedemo.com/");

		// Step 3: find User name text box
		WebElement wb = driver.findElement(By.name("user-name"));

		System.out.println(wb.isDisplayed());
		System.out.println(wb.isEnabled());

		wb.sendKeys("standard_user");

		// find password text box

		WebElement wb1 = driver.findElement(By.name("password"));

		System.out.println(wb1.isDisplayed());
		System.out.println(wb1.isEnabled());

		wb1.sendKeys("secret_sauce");
		
		

		// find login button
		WebElement wb2 = driver.findElement(By.name("login-button"));

		System.out.println(wb2.isDisplayed());
		System.out.println(wb2.isEnabled());
		wb2.click();

		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\Screenshot\\"+"p.jpg"));
		// capture home page title

		System.out.println(driver.getTitle());

		// capture home page url

		System.out.println(driver.getCurrentUrl());

		// find Sauce Labs Backpack add to cart product Object/Element

		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));

		driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
		
		TakesScreenshot ts1=(TakesScreenshot)driver;
		
		File src1=ts1.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src1, new File(System.getProperty("user.dir")+"\\Screenshot\\"+"q.jpg"));

		// find Sauce Labs Bike Light add to cart product

		driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']"));

		driver.findElement(By.xpath("(//button[text()='Add to cart'])[2]")).click();
		
		//find Sauce Labs Bolt T-Shirt add to cart product 

		driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));

		driver.findElement(By.xpath("(//button[text()='Add to cart'])[3]")).click();
		
		Thread.sleep(3000);
		//find the shopping cart container and click on shopping cart container

		driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
		
		Thread.sleep(3000);
		// find the checkout button and click on checkout button
		
		driver.findElement(By.name("checkout")).click();
		Thread.sleep(3000);
		//find the first name text box
		
		driver.findElement(By.name("firstName")).sendKeys("ABC");
		
		//find the last name text box
		
		driver.findElement(By.name("lastName")).sendKeys("PQR");
		
		//find the zip text box
		
		driver.findElement(By.name("postalCode")).sendKeys("411028");
		
		//find the continue button 
		
		driver.findElement(By.name("continue")).click();		
		
		
		//find the finish button
		
		driver.findElement(By.name("finish")).click();
		
		//find the back Home button
		
		driver.findElement(By.name("back-to-products")).click();
		
		//click on open Menu
		
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		
		Thread.sleep(1000);
		
		//click on logout button
		
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	}

}
