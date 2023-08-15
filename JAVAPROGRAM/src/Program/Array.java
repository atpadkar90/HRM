package Program;

public class Array {

	public static void main(String[] args) {
		
		
		String[]a= new String[4];
		
		a[0]="selenium";
		a[1]="java";
		a[2]="cucumber";
		a[3]="testng";
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		
		}
		
		System.out.println("**********************************");
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		
		}
		System.out.println("**********************************");
		
		
		for(String abc:a)
		{
			System.out.println(abc);
		}
	}

}
