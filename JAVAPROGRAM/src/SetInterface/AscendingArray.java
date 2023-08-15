package SetInterface;

import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class AscendingArray {
	
	public static void main(String[] args) {
		
//descending string order
	
	String [] abc= {"Selenium","RestAssured","Hamcrest","Hamcrest","Jenkins","POJO","RestAssured"};
	
	TreeSet ts=new TreeSet();

	for(int i=0;i<abc.length;i++)
	{
	ts.add(abc[i]);
		
	}
		System.out.println(ts);
		
		NavigableSet ns=ts.descendingSet();
		System.out.println(ns);
			
	

//print duplicate String
	
	Set s= new LinkedHashSet();
	
	for(String a:abc)
	{
		if(!s.add(a))
		{
			System.out.println(a);
		}
	}
	
}
}