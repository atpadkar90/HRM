package Tutorial;

public class Demo3 {

	public static String revser(String a)
	{
		String str="";
		for(int i=a.length()-1;i>=0;i--)
		{
			str=str+a.charAt(i);
		}
		
		return str;
	}
	
	
	
	
	public static void main(String[] args) {
		
		String a=Demo3.revser("Selenium");
		
		System.out.println(a);

	}

}
