package ConnectBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandelDropDown {

	public static void main(String[] args) {
		
		Select sel;
		WebElement w;
		List<WebElement> ls;
		
		//up casting concept
		WebDriver driver=new ChromeDriver();
		
		//open fb url
		driver.get("https://www.facebook.com/register");
		
		//find element for day
		
		WebElement wb1=driver.findElement(By.name("birthday_day"));
		
		//create object of select class by passing webelement instance
		
		 sel = new Select(wb1);
		
		//the select drop down value by using selectByVlaue
		
		sel.selectByValue("4");
	
		 w=sel.getFirstSelectedOption();
		System.out.println(w.getText());

		ls=sel.getOptions();
		int a=ls.size();
		System.out.println(a);
		
		for(WebElement abc:ls)
		{
			System.out.println(abc.getText());
		}

				
		WebElement wb2=driver.findElement(By.name("birthday_month"));
		
		sel = new Select(wb2);
		
		sel.selectByIndex(10);
		
		 w=sel.getFirstSelectedOption();
		System.out.println(w.getText());
		
		ls=sel.getOptions();
		int b=ls.size();
		System.out.println(b);
		
		for(WebElement abc:ls)
		{
			System.out.print(abc.getText());
			System.out.println("|");
		}

		
		
WebElement wb3=driver.findElement(By.name("birthday_year"));
		
		 sel = new Select(wb3);
		
		sel.selectByVisibleText("2010");
		
		 w=sel.getFirstSelectedOption();
		System.out.println(w.getText());
		
		 ls=sel.getOptions();
		int c=ls.size();
		System.out.println(c);
		
		for(WebElement abc:ls)
		{
			System.out.print(abc.getText());
			System.out.println("|");
		}
		
		

	}

}
