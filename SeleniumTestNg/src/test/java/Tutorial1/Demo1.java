package Tutorial1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo1 {
	
	//@Test(invocationCount=3,threadPoolSize=2)
	@Test
	public void s1()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.close();
		String abc=driver.getTitle();
		
		//Assert.assertEquals(abc.concat("google"), true);
		
		SoftAssert soft= new SoftAssert();
		soft.assertEquals(abc.concat("google"), true);
	//	soft.assertAll();
		System.out.println(abc);
	}
	

}
