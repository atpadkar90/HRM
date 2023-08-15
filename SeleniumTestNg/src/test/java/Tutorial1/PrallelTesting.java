package Tutorial1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PrallelTesting {
	public static WebDriver driver;
	@Parameters("broswername")
	@Test
	public void parallelTesting(String broswername) {
		
		if(broswername.equals("Chrome"))
		{
			WebDriver driver= new ChromeDriver();
			driver.get("http://www.facebook.com");
		}
		if(broswername.equals("edge"))
		{
			 driver= new EdgeDriver();
			driver.get("http://www.gmail.com");
		}
		
		if(broswername.equals("firefox"))
		{
			 driver= new FirefoxDriver();
			driver.get("http://www.rediffmail.com");
		}
	}

}
