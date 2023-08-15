package ConnectBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleChrome {

	public static void main(String[] args) {
		
	//	System.setProperty("webdriver.chrome.driver","E:\\GITHUBCMD\\Selenium\\ALLDrivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		
//		String a=driver.getCurrentUrl();
//		System.out.println(a);
//		
//		driver.navigate().to("https://www.redbus.in/?gclid=CjwKCAjwhJukBhBPEiwAniIcNU35YEnLCNfOx1RrHUSCyBjnLXaLkG-akILxh6gXsDQReaRqLr31nRoC0vIQAvD_BwE");
//		
//		String b=driver.getCurrentUrl();
//		System.out.println(b);
//		
//		
//	driver.navigate().to("https://www.amazon.in/");
//		
//		String c=driver.getCurrentUrl();
//		System.out.println(c);
//		
//		driver.navigate().back();
//		System.out.println(driver.getTitle());
//		
//		driver.navigate().back();
//		System.out.println(driver.getTitle());
//		
//		driver.navigate().forward();
//		System.out.println(driver.getTitle());
//		
//		driver.navigate().refresh();
		driver.close();
		
	}

}
