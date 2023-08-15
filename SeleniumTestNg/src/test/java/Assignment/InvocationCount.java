package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCount {
	
	
	@Test(invocationCount =5, threadPoolSize=3)
	public void abc()
	{
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com");
	driver.quit();
	}

}
