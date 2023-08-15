package Tutorial;

public class Palindrom {

	public static boolean palindrom(String a)
	{
	//	char[]b=a.toCharArray();
		
		String rev="";
		
		
			for(int j=a.length()-1;j>=0;j--)
			{
				rev=rev+a.charAt(j);
		
			
			if(a.equals(rev))
			{
				return true;
		       
			}
			}
		
			return false;
			
	}
	
	
	public static void main(String[] args) {
		
	boolean a=Palindrom.palindrom("ada");
	
	System.out.println(a);
		

	}

}
