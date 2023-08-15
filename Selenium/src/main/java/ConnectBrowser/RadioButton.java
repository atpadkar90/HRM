package ConnectBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement wb=driver.findElement(By.xpath("//input[@name='radiooptions'][1]"));

		Thread.sleep(3000);
		System.out.println( wb.isDisplayed());
		System.out.println(wb.isEnabled());
		System.out.println(wb.isSelected());
		
		wb.click();
		
		System.out.println(wb.isSelected());
		
		WebElement wb1=driver.findElement(By.xpath("(//input[@name='radiooptions'])[2]"));

		Thread.sleep(3000);
		System.out.println( wb1.isDisplayed());
		System.out.println(wb1.isEnabled());
		System.out.println(wb1.isSelected());
		wb1.click();
		
		System.out.println(wb.isSelected());
//		
//		WebElement wb2=driver.findElement(By.id("gender-radio-3"));
//
//		Thread.sleep(3000);
//		System.out.println( wb2.isDisplayed());
//		System.out.println(wb2.isEnabled());
//		System.out.println(wb2.isSelected());
		
	}

}
