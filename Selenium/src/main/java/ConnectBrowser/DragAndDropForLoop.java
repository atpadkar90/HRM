package ConnectBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropForLoop {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	
	for(int i=1;i<=7;i++)
	{
		WebElement src=driver.findElement(By.id("box"+i));
		
		WebElement targ=driver.findElement(By.id("box10"+i));
		
		Actions act = new Actions(driver);

		act.dragAndDrop(src, targ).build().perform();

	}
	
	}

}
