package ConnectBrowser;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboradPagUpandDown {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.com");
		
		
		Actions act=new Actions(driver);
		
		act.keyDown(Keys.END).keyUp(Keys.END).keyDown(Keys.HOME).keyUp(Keys.HOME).build().perform();

	}

}
