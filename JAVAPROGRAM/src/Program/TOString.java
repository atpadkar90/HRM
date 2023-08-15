package Program;

import java.util.Arrays;

public class TOString {

	public static void main(String[] args) {
		
String[] xyz = { "java", "selenium", "testng" };
		
		
		
		boolean b = Arrays.toString(xyz).contains("selenium");
		
		System.out.println(b);
		
		
		boolean c = Arrays.asList(xyz).contains("cucumber");
		
		System.out.println(c);
	}

}
