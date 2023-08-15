package Tutorial;

public class StaticMethod {

	
	public static void reverser(String abc)
	{
		
			for(int j=abc.length()-1;j>=0;j--)
			{
				System.out.print(abc.charAt(j));
			}
			
		
	}
	
	
	public static void main(String[] args) {
		
		StaticMethod.reverser("Sagar");

	}

}
