package ConnectBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement src=driver.findElement(By.id("box1"));
		
		WebElement targ=driver.findElement(By.xpath("//div[text()='Norway']"));
		
		WebElement src1=driver.findElement(By.id("box2"));
		
		WebElement targ1=driver.findElement(By.xpath("//div[text()='Sweden']"));
		
		WebElement src2=driver.findElement(By.id("box3"));
		
		WebElement targ2=driver.findElement(By.xpath("//div[text()='United States']"));
		
		WebElement src3=driver.findElement(By.id("box4"));
		
		WebElement targ3=driver.findElement(By.xpath("//div[text()='Denmark']"));
		
		WebElement src4=driver.findElement(By.id("box5"));
		WebElement targ4=driver.findElement(By.xpath("//div[text()='South Korea']"));
		
		WebElement src5=driver.findElement(By.id("box6"));
		WebElement targ5=driver.findElement(By.xpath("//div[text()='Italy']"));
		
		WebElement src6=driver.findElement(By.id("box7"));
		WebElement targ6=driver.findElement(By.xpath("//div[text()='Spain']"));
		
		Actions act = new Actions(driver);

		act.dragAndDrop(src, targ).dragAndDrop(src1, targ1).dragAndDrop(src2, targ2).
		dragAndDrop(src3, targ3).dragAndDrop(src4, targ4).dragAndDrop(src5, targ5).
		dragAndDrop(src6, targ6).build().perform();

	}

}
