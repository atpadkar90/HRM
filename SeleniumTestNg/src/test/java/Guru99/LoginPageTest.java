package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseLayerPack.BaseClasss;
import junit.framework.Assert;

public class LoginPageTest extends BaseClasss {

	@Test(priority=1)
	public void validateUserOnLoingPage()
	{
		
		driver.findElement(By.xpath("//a[text()=' sign-in ']")).click();
		//driver.findElement(By.xpath("//span[text()='Close']")).click();
	}
	
	
	@Test(priority=2)
	public void enterUserName()
	{
		driver.findElement(By.name("userName")).sendKeys("ABC123");
		driver.findElement(By.name("password")).sendKeys("ABC@123");
		driver.findElement(By.name("submit")).click();
	}
	
	
	
	@Test(priority=3)
	public void loginSucessful()
	{
		WebElement wb4=driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
		String login=wb4.getText();
		
		Assert.assertEquals(login.contains("Login Successfully"), true);
		
	}
}
