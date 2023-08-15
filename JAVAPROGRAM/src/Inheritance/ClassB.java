package Inheritance;

public class ClassB extends ClassA{

	public void qpr()
	{
		System.out.println("class B");
	}
	
	public static void main(String[] args) {
		
		ClassB obj=new ClassB();
		
		obj.abc();
		obj.qpr();
		
	}

}
