package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;

public class LogPageTest extends BaseClass{
	
	RegisterPage register;
	
	@BeforeTest
	public void setUp() {
		
		BaseClass.initialization();
	}
	
@Test(priority=1)
	public void validateContactInfo()
	{
		 register= new RegisterPage();
		 register.contactInformation("sagar", "Atpadkar", "123456", "sagar@gmail.com");
		
	}
@Test(priority=2)
	public void validMailingInfo()
	{
		register= new RegisterPage();
		register.mailingInformation("hadapsar", "pune", "Pune", "123456");
	}


@Test(priority=3)
public void validUserInfo()
{
	register= new RegisterPage();
	register.userInformation("Sagar123","Sagar@123", "Sagar@123");
	register.clickOnButton();
}

@AfterTest
public void teraDown()
{
	driver.quit();
}

}
