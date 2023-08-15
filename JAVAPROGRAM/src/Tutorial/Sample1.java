package Tutorial;

public class Sample1 extends Demo1{
//even display number
	
	public static void abc(int a, int b)
	{
		for(int i=a;i<=b;i=i+2)
		{
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		
		Sample1 obj=new Sample1();
		
		obj.abc(10,50);
		
		
	}
}

