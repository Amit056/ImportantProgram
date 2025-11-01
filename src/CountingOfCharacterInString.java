package amit;

public class CountingOfCharacterInString {

	public static void main(String[] args) {
		String s="amit kumar ray";
	/*	int count=0;
			 char[] ch = s.toCharArray();
			 System.out.println(ch);
			 for(int i=0;i<ch.length;i++)
				{
				 System.out.println(ch[i]);
				 count++;
				}
System.out.println(count);
	



String t="to count number of words in a string";
String k = t.toUpperCase();
System.out.println(k);
}*/

//TO COUNT NUMBER OF WORDS IN A STRING
 
int count=1;
	for(int i=0;i<s.length()-1;i++)
	{
		if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
		count++;
	}
	System.out.println(count);
} 
}
//CONVERTING ARRAY TO STRING
/*
char[] ch = s.toCharArray();
System.out.println(ch);
for(int i=0;i<ch.length;i++)
	{
	 System.out.println(ch[i]);
	}*/