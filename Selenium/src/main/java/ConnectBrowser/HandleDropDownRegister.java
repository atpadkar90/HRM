package ConnectBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownRegister {

	static Select sel;
	static WebElement wb;

	public static void main(String[] args) throws Exception {

		/*
		 Step 1: Up casting
	Step 2; Open a https://demo.automationtesting.in/Register.html URL
	
	step 3: Find the Skills drop down element
	Step 4: select the value using Select by Visible Text method
	step 5: capture /copy the selected value from drop down.
	step 6: count how many value present in drop down
	
	step 7: Find the year month drop down element
	Step 8: select the value using Select by Visible text method
	step 9: capture /copy the selected value from drop down.
	step 10: count how many value present in drop down

	step 11: find the month drop down element
	step 12: select the value using select by index method
	step 13: capture /copy the selected value from drop down.
	step 14: count how many value present in drop down
	
	step 15: find the date drop down element
	step 16: select the value using select by value method
	step 17: capture /copy the selected value from drop down.
	step 18: count how many value present in drop down
		 */

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");

		wb = driver.findElement(By.id("Skills"));
		sel = new Select(wb);

		sel.selectByVisibleText("APIs");
		String a = sel.getFirstSelectedOption().getText();
		System.out.println("selected value from drop down : " + a);
		int b = sel.getOptions().size();
		System.out.println("count  value present in drop down : " + b);

		System.out.println("*******************************************");

		
		wb = driver.findElement(By.xpath("//select[@id='yearbox']"));
		sel = new Select(wb);
		sel.selectByVisibleText("1990");
		String c = sel.getFirstSelectedOption().getText();
		System.out.println("selected value from drop down : " + c);
		int d = sel.getOptions().size();
		System.out.println("count  value present in drop down : " + d);
		System.out.println("*******************************************");

		wb = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		sel = new Select(wb);
		sel.selectByIndex(10);
		String e = sel.getFirstSelectedOption().getText();
		System.out.println("selected value from drop down : " + e);
		int f = sel.getOptions().size();
		System.out.println("count  value present in drop down : " + f);
		System.out.println("***************");

		
	
		wb = driver.findElement(By.xpath("//select[@id='daybox']"));
		sel = new Select(wb);
		sel.selectByValue("4");
		String g = sel.getFirstSelectedOption().getText();
		System.out.println("selected value from drop down : " + g);
		int h = sel.getOptions().size();
		System.out.println("count  value present in drop down : " + h);
		System.out.println("*******************************************");
	}

}
