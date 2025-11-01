package amit;

import java.util.HashMap;

public class OccurenceOfCharacter {

	public static void main(String[] args) {
		int count=0;
		String s="AMIT KUMAR  RAY";
		char[] ch = s.toCharArray();
		HashMap<Character,Integer> h=new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++)
		{
			count=0;
			for(int j=0;j<s.length();j++)
			{
		if(ch[i]==ch[j])
		count++;
			}
		h.put(ch[i], count);
		}
System.out.println(h);
	}

}
