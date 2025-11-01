package amit;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a num");
		int n=s.nextInt();
		int k = isStrongNum(n);
		System.out.println(k);
		if(k==n)
			System.out.println(n+":is strong number");
		else
			System.out.println(n+":is not a strong number");

	}
	static int isStrongNum(int x)
	{
		int sum=0;
		do
		{
			int d=x%10;
			sum=fact(d)+sum;
			x=x/10;
		}
		while(x!=0);
		return sum;
	}
	static int fact(int a)
	{
		int product=1;
		while(a!=0)
		{
			product=product*a;
			a--;
		}
		return product;
	}
}
