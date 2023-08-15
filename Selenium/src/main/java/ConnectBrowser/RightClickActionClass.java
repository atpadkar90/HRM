package ConnectBrowser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickActionClass {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement wb = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement wb1 = driver.findElement(By.xpath("//span[text()='Copy']"));

		Actions act = new Actions(driver);

		act.contextClick(wb).click(wb1).build().perform();

		Alert alt = driver.switchTo().alert();

		String a = alt.getText();
		System.out.println(a);

		alt.accept();

	}

}
