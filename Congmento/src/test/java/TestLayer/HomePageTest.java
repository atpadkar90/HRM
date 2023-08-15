package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayerPackage.BaseClass;

//@Test(groups = { "HomePage","Regression" }, dependsOnGroups = { "LoginPage" })
public class HomePageTest extends BaseClass {
	

	@Test(priority = 1)
	public void validateHomePageTitle() {
		String a=driver.getTitle();
		Assert.assertEquals(a.contains("Cogmento CRM"),true);
	}

	@Test(priority = 2)
	public void validateHomePageUrl() {
		
	
		Assert.assertEquals(driver.getCurrentUrl().contains("cogmento"), true);
	}

	

}
