package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayerPack.BaseClasss;
import junit.framework.Assert;


public class RegisterPageTestClass extends BaseClasss {
	
	@BeforeTest
	public void setUP()
	{
		BaseClasss.initilization();
	}
	
	@Test(priority=1)
	public void validateURL() {
		
		String actualurl=driver.getCurrentUrl();
		
		Assert.assertEquals(actualurl.contains("guru99"), true);
		
	}

	@Test(priority=2)
	
	public void validateTitle()
	{
			String title=driver.getTitle();
		
		Assert.assertEquals(title.contains("Register"), true);
		
	}
	
	@Test(priority=3)
	public void contactInformation()
	{
		driver.findElement(By.name("firstName")).sendKeys("ABC");
		driver.findElement(By.name("lastName")).sendKeys("PQR");
		driver.findElement(By.name("phone")).sendKeys("123456789");
		driver.findElement(By.id("userName")).sendKeys("ABC@TCS.com");
		
		
	}
	
	@Test(priority=4)
public void  mailingInformation()
{
		driver.findElement(By.name("address1")).sendKeys("Pune");
		driver.findElement(By.name("city")).sendKeys("Pune");
		driver.findElement(By.name("state")).sendKeys("MH");
		driver.findElement(By.name("postalCode")).sendKeys("12345");
		WebElement wb=driver.findElement(By.name("country"));
		Select sel= new Select(wb);
		sel.selectByVisibleText("INDIA");
		
}
	@Test(priority=5)
	public void userInformation()
	{
		driver.findElement(By.name("email")).sendKeys("ABC123");
		driver.findElement(By.name("password")).sendKeys("ABC@123");
		driver.findElement(By.name("confirmPassword")).sendKeys("ABC@123");
		driver.findElement(By.name("submit")).click();
	}
	
}
