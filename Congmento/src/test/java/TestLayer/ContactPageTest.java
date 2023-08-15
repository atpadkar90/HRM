package TestLayer;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseLayerPackage.BaseClass;
import UtilsLayerPackage.ExcelReaderClass;

public class ContactPageTest extends BaseClass{
	
	
		

	
	@Test(priority=1,dataProvider="getContactData")
	public void validUserCreate(String fname,String lname,String mname,String email,String status) throws InterruptedException
	 {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class='ui linkedin button'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("first_name")).sendKeys(fname);
		driver.findElement(By.name("last_name")).sendKeys(lname);
		driver.findElement(By.name("middle_name")).sendKeys(mname);
		//driver.findElement(By.name("company")).sendKeys(email);
	//	driver.findElement(By.xpath("//button[text()='Public']")).click();
		driver.findElement(By.name("value")).sendKeys(email);
		driver.findElement(By.name("status")).click();
	List<WebElement>ls=	driver.findElements(By.xpath("(//div[@name='status'])/span"));
	
	for(WebElement abc:ls)
	{
		String a= abc.getText();
		
		if(a.equalsIgnoreCase(status))
		{
			abc.click();
			break;
		}
	}
	
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	}
	

	
	
	@DataProvider
	public Object[][]  getContactData() throws IOException
	{
		ExcelReaderClass obj =new ExcelReaderClass(System.getProperty("user.dir")+"\\src\\main\\java\\TestData\\Cogmento CRM test Data.xlsx");

		Object[][] data = obj.getAllSheetData(0);
		
		return data;

	}

}
