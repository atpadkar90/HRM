package Program;

public class DuplicateNumber {

	public static void main(String[] args) {
		
		
		int abc[]= {100,200,200,300,300,4,5,61};
		
		for(int i=0;i<abc.length;i++)
		{
			for(int j=i+1;j<abc.length;j++)
			{
				
				if(abc[i]==abc[j])
				{
					System.out.println(abc[i]);
				}
			}
		}
		

	}

}
