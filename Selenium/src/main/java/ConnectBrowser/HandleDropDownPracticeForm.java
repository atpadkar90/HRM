package ConnectBrowser;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownPracticeForm {

	public static void main(String[] args) throws Exception {
		/*Scenario:
	Step 1: Up casting
	Step 2; Open a https://demoqa.com/automation-practice-form URL
	
	step 3: check displayed status, enabled status , enter fname, 
	step 4: check displayed status, enabled status enter lastname,
	step 5: check displayed status, enabled status enter email, 
	step 6: check displayed status, enabled status ,selected status and select gender,
	step 7: check displayed status, enabled status enter mobile no

	step 8: click on date of birth Object

	step 9:Select Month using selectByIndex() method
			drop down xpath :  	//select[@class='react-datepicker__month-select']
	
		i) select any month		--	
		ii) captured selected month
		iii) count how many value present
	
	step 10: select year using selectByVisibleText() method
			year drop down xpath: 	//select[@class='react-datepicker__year-select']

		i) select anyone year 			
		ii) captutred selected month
		iii) count how many value present

	step 11:select anyone date:			
		select date xpath : 	(//div[text()='15'])[1]
		

	step 12; check displayed status, enabled status enter Subjects
	step 13: check displayed status, enabled status , selected status and selected all checkbox of hobbies
	
	step 14: check displayed status, enabled status enter  Current Address
*/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");

		
		WebElement wb=driver.findElement(By.id("firstName"));
		if(wb.isDisplayed()&&(wb.isEnabled()))
		{
			wb.sendKeys("sagar");
		}
		
		WebElement wb1=driver.findElement(By.id("lastName"));
		if(wb1.isDisplayed()&&(wb1.isEnabled()))
		{
			wb1.sendKeys("Atpadkar");
		}
		
		WebElement wb2=driver.findElement(By.id("userEmail"));
		if(wb2.isDisplayed()&&(wb2.isEnabled()))
		{
			wb2.sendKeys("sagar@gmail.com");
		}
//		
		Thread.sleep(5000);
//		
		WebElement wb3=driver.findElement(By.xpath("//label[text()='Male']"));
		
		Actions act=new Actions(driver);
		act.click(wb3).build().perform();
		
		
//		if(wb3.isDisplayed()&&(wb3.isEnabled()&& wb3.isSelected()))
//		{
//			Thread.sleep(5000);
//			wb3.click();
//		  }
		
		
		WebElement wb4=driver.findElement(By.id("userNumber"));
		if(wb4.isDisplayed()&&(wb4.isEnabled()))
		{
			wb4.sendKeys("8087190");
		}
		Thread.sleep(5000);
		driver.findElement(By.id("dateOfBirthInput")).click();
		
	Thread.sleep(5000);
		
		WebElement wb5=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		
		Select sel=new Select(wb5);
		
		sel.selectByIndex(10);
		String a=sel.getFirstSelectedOption().getText();
		
		System.out.println("captured selected month is : "+a);
		
		int aa=sel.getOptions().size();
		System.out.println(aa);
		
		System.out.println("*********************************");
		
		
		Thread.sleep(3000);
WebElement wb6=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		
		Select sel1=new Select(wb6);
		
		sel1.selectByVisibleText("1990");
		String b=sel1.getFirstSelectedOption().getText();
		System.out.println("captured selected year is : "+b);
		
		int bb=sel1.getOptions().size();
		System.out.println(bb);
		System.out.println("*********************************");
		
		
		Thread.sleep(5000);
		
 driver.findElement(By.xpath("(//div[text()='4'])[1]")).click();
	
//		Select sel2=new Select(wb7);
//		
//		sel2.selectByIndex(3);
//		String c=sel2.getFirstSelectedOption().getText();
//		System.out.println("captured selected data is : "+c);
//		
//		int cc=sel2.getOptions().size();
//		System.out.println(cc);
//		System.out.println("*********************************");
//		
	Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//div[@class='subjects-auto-complete__control css-yk16xz-control']")).sendKeys("Sport");
		
			
		
		
		
		List<WebElement>ls1= driver.findElements(By.xpath("//label[@class='custom-control-label']"));
		
		int z=ls1.size();
		System.out.println(z);
		
		for(int i=3;i<z;i++)
		{
			ls1.get(i).click();
		}
		
	
	
	}

}
