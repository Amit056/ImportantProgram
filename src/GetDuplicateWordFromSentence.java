package amit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GetDuplicateWordFromSentence {

	public static void main(String[] args) {
		String sentence= "dhoni is best is the best of the player";
		String[] part=sentence.split(" ");
		Set<String> s=new HashSet<String>();
		
	/*	for(int i=0;i<part.length;i++)
		{
		String text=part[i];
		if(s.add(text)==false)
		{
			System.out.println(text);
		}
		}
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<part.length;i++)
		{
			String text=part[i];
			al.add(text);
		}
		Collections.sort(al);
		for(String i:al)
			System.out.println(i);*/
		TreeSet<String> tl=new TreeSet<String>();
		for(int i=0;i<part.length;i++)
		{
			String text=part[i];
			tl.add(text);
			
		}
		for(String i:tl)
			System.out.println(i);
		
	}

}
