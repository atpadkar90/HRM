package Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	//print all data in consol
		
		public static void main(String[] args) {
			//upcating concept
			WebDriver driver =new ChromeDriver();
			//open url
			driver.get(null);
			//find column and store in weblement
			
			List<WebElement>ls=driver.findElements(By.tagName("td"));
			
			//count total column
			
			int a=ls.size();
		
		//print all column name in colsole
			
			for(int i=0;i<a;i++)
			{
				String ab=ls.get(i).getText();
				System.out.println(ab);
			}
		}

	}

