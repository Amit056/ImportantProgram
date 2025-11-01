package amit;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		String text=String.valueOf(n);
	/*	boolean k = isPallindrome(n);
		if(k==true)
System.out.println(n+":is a pallindrome number");
		else
			System.out.println(n+":is a not pallindrome number");	

	}
public static boolean isPallindrome(int x)
{
	int temp=x,rev=0;
	do
	{
		int d=x%10;
		 rev=rev*10+d;
		 x=x/10;
	}
	while(x!=0);
	if(temp==rev)
		return true;
	else
		return false;
	}
		String num=String.valueOf(n);
		String s1="   ";
		for(int i=0;i<num.length();i++)
		{
			s1=num.charAt(i)+s1;
			}
		String t = s1.trim();
		if(t.equals(s1))
			System.out.println("yes");
		else
			System.out.println("no brodfg");
		System.out.println(s1);
		if(s1.equals(num))
			System.out.println(n+":is a pallindrome num");
		else
			System.out.println(n+":is not a pallindrome num");
			
		}*/
StringBuilder sb=new StringBuilder(text);
StringBuilder t = sb.reverse();
System.out.println(sb);
}
}