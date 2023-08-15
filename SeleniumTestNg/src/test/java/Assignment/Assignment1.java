package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Assignment1 {
	
	WebDriver driver;
	
	public static void verifytextbox(WebElement wb, String value)
	{
		if(wb.isDisplayed()&&(wb.isEnabled()))
		{
			wb.sendKeys(value);
		}
	}
	
	public static void clickOnButton(WebElement wb)
	{
		if(wb.isDisplayed()&&(wb.isEnabled()))
		{
			wb.click();
		}
	}
			
	
	@BeforeClass
	
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.saucedemo.com/");
	}
	
	
	
	@Test(priority=1)
	
	public void loginPage()
	{
		WebElement wb = driver.findElement(By.name("user-name"));
		WebElement wb1 = driver.findElement(By.name("password"));
		WebElement wb2 = driver.findElement(By.name("login-button"));
		Assignment1.verifytextbox(wb, "standard_user");
		Assignment1.verifytextbox(wb1, "secret_sauce");
		Assignment1.clickOnButton(wb2);
	}
	
	@Test(priority=2)
	
	public void caputeHomePageTile()
	{
		String a=driver.getTitle();
		
		Assert.assertEquals(a.contains("Swag Labs"), true);
		
		System.out.println(a);
	}
	
@Test(priority=3)
public void capturePageURL()
{
	String b=driver.getCurrentUrl();
	

	Assert.assertEquals(b.contains("saucedemo"), true);
	
	System.out.println(b);
}
@Test(priority=4)
public void addCartProduct()
{
	driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));

	WebElement wb3=driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]"));
	Assignment1.clickOnButton(wb3);

	
	driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']"));

	WebElement wb4=driver.findElement(By.xpath("(//button[text()='Add to cart'])[2]"));
	
	Assignment1.clickOnButton(wb4);

	driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));

	WebElement wb5=driver.findElement(By.xpath("(//button[text()='Add to cart'])[3]"));
	Assignment1.clickOnButton(wb5);

}

@Test(priority=5)

public void CartContainerAndCheckOut()
{
	WebElement wb6=driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
	Assignment1.clickOnButton(wb6);
	
	WebElement wb7=driver.findElement(By.name("checkout"));
	Assignment1.clickOnButton(wb7);
}

@Test(priority=6)
public void checkOutInfo()
{
	WebElement wb8=driver.findElement(By.name("firstName"));
	Assignment1.verifytextbox(wb8, "ABC");
	
	WebElement wb9=driver.findElement(By.name("lastName"));
	Assignment1.verifytextbox(wb9, "PQR");
	
	WebElement wb10=driver.findElement(By.name("postalCode"));
	Assignment1.verifytextbox(wb10, "411028");
	
	WebElement wb11=driver.findElement(By.name("continue"));
	Assignment1.clickOnButton(wb11);
}

@Test(priority=7)
public void checkOutOverview()
{
	WebElement wb12=driver.findElement(By.name("finish"));
	Assignment1.clickOnButton(wb12);
	
	WebElement wb13=driver.findElement(By.name("back-to-products"));
	Assignment1.clickOnButton(wb13);
}


@Test(priority=8)

public void HomePageTile()
{
	String e=driver.getTitle();
	
	Assert.assertEquals(e.contains("Swag Labs"), true);
	
	System.out.println(e);
}


@AfterClass()
public void logout()
{
	WebElement wb14=driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
	Assignment1.clickOnButton(wb14);
	
	driver.close();
	}
}

