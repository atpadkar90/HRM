package StringSplit;

public class ReverserString {

	public static void main(String[] args) {

String a="sagar atpadkar";
String [] abc=a.split(" ");

for(int i=0;i<abc.length;i++)
{
	//System.out.println(abc[i]);
	String b=abc[i];
	int c=b.length();
	
	for(int j=c-1;j>=0;j--)
	{
		char e=b.charAt(j);
		System.out.print(e);
	}
	System.out.print(" ");
}

	}

}
