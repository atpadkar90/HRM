package Reverse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static String reverse(String a) {
		WebDriver driver = new ChromeDriver();
		driver.get(a);

		String aa = driver.getTitle();

		String[] rev = aa.split(" ");

		String str = rev[0];
		String str1 = " ";

		for (int i = str.length() - 1; i >= 0; i--) {
			str1 = str1 + str.charAt(i);

		}
		// System.out.print(str1);

		String Str2 = " ";

		for (int j = 1; j < str.length() - 1; j++) {
			Str2 = Str2 + " " + rev[j];
		}

		// System.out.println(Str3);

		return str1 + Str2;

	}

	public static void main(String[] args) {

		String a = FaceBook.reverse("https://www.facebook.com/");
		System.out.println(a);
	}

}
