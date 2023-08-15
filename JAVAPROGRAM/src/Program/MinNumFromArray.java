package Program;

public class MinNumFromArray {
	
	
	public static int minfind(int []abc)
	{
		int min=abc[0];
		
		for(int i=0;i<abc.length;i++)
		{
			if(abc[i]<min)
			{
				min=abc[i];
			}
		}
		return min;
		//System.out.println("min number is "+min);
		
	}

	public static void main(String[] args) {
		
		MinNumFromArray m=new MinNumFromArray();
		int abc[]= {10,30,40,4,80,6};
	int a= MinNumFromArray.minfind(abc);
	System.out.println(a);
		
		

	}

}
