package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseLayerPack.BaseClasss;
import junit.framework.Assert;

public class RegisterSucessTest extends BaseClasss{

	
	
	@Test(priority=1)
	public void validateSuccessPageURL()
	{
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url.contains("sucess"),true);
		
	}
	@Test(priority=2)
	public void userName()
	{
		WebElement wb2=driver.findElement(By.xpath("//b[contains(text(),' Dear')]"));
		
		String abc=wb2.getText();
		System.out.println(abc);
		//Assert.assertEquals(abc.contains("ABC"),true);
		
		WebElement wb3=driver.findElement(By.xpath("//b[contains(text(),' Note: Your user ')]"));
		
		String pqr=wb2.getText();
		
		Assert.assertEquals(pqr.contains("ABC"),true);
	}
	
}
