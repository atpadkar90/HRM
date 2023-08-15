package FullScreenshot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;



public class PageScreenshot {

	public static void main(String[] args) throws IOException {

	WebDriver driver=new ChromeDriver();
		

		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
				
		Screenshot ts = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		
		String path=System.getProperty("user.dir")+"//Sceenshot"+"//b.jpg";
		
		ImageIO.write(ts.getImage(), "jpg", new File(path));

	}

}
