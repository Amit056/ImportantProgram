package amit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSelectingAtEvenPosition {
	public static void main(String[] args) {
	String s="a1b2c3";
	ArrayList<String> al=new ArrayList<String>();
	ArrayList<String> al1=new ArrayList<String>();
	for(int i=0;i<s.length();i++)
	{
	if(i%2==0)
	{
		String k = String.valueOf(s.charAt(i));
		al.add(k);
	}
	else if(i%2!=0)
	{
		String l = String.valueOf(s.charAt(i));
		al1.add(l);
	}
	}
	System.out.println(al);
	System.out.println(al1);
	/*al.addAll(al1);
	System.out.println(al);
	al1.addAll(al);
	System.out.println(al1);
	Collections.sort(al1);
	for(String i:al1)
		System.out.print(i);*/
	al.addAll(al1);
	for(String i:al)
System.out.print(i);
	al1.addAll(al);
	System.out.println("");
	for(String x:al1)
		System.out.print(x);
	
}
	}