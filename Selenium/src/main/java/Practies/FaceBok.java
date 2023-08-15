package Practies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FaceBok {

	public static void main(String[] args) {
		
 ChromeOptions opt= new 	ChromeOptions();

 		opt.addArguments("--headless");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.facebook.com/");

		String a =driver.getTitle();
		
		System.out.println(a);
		
		String []abc=a.split(" ");
		
		for(int i=0;i<abc.length;i++)
		{
			
		String aa=abc[i];
		
		int x=aa.length();
		
		for(int j=x-1;j>=0;j--)
		{
			
		System.out.print(aa.charAt(j));
		  }
		}
		System.out.println(" ");
	}
	}

