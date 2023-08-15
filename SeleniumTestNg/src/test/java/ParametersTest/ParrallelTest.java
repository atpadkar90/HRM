package ParametersTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParrallelTest {
	WebDriver driver;
	
	@Parameters({"broswername"})

	@Test(priority = 1)
	public void oranehrm1(String broswername)  
	{
		if(broswername.equals("chrome"))
		{
			 driver = new ChromeDriver();
		}
		else if(broswername.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		else if(broswername.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getCurrentUrl());

	}

}
