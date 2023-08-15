package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JAVASCRIPt {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('wlecome')");
		
		Alert alt=driver.switchTo().alert();
		Thread.sleep(5000);
		alt.accept();

	}

}
