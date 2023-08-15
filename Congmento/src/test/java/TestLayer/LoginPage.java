package TestLayer;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayerPackage.BaseClass;

public class LoginPage extends BaseClass {
	
	@BeforeTest
	public void setUPp()
	{
		BaseClass.initilization();
	}
	
	@Test
	public void loginFunctionality()
	{
		
		driver.findElement(By.name("email")).sendKeys("atpadkar90@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Handelawns@412308");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
	}
	

}
