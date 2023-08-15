package Program;

public class Palindrom {

	public static void main(String[] args) {
	
		String a="madam";
		String b="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
			
		}
		
		if(a.equals(b))
		{
			System.out.println("String is palindrom"+a);
		}
		else
		{
			System.out.println("String is not plaindrom"+a);
		}

	}

}
