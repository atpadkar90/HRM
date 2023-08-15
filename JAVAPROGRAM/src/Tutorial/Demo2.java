package Tutorial;

public class Demo2 {
	
	public static String reverse()
	{
		String a="Automation";
		
		String str=" ";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			
			str=str+a.charAt(i);
		}
		
		return str;
	}

	public static void main(String[] args) {
		
		String a=Demo2.reverse();
		
		System.out.println(a);
		
	}

}
