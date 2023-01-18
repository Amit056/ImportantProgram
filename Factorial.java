package amit;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int n = s.nextInt();
		int sum=0;
		while(n!=0)
		{ 
			
			int x=n%10;
			int k = factorialOFnum(x);
			sum=sum+k;
			System.out.println(sum);
			n=n/10;
		}
	System.out.println(sum);
		
		}
	public static int factorialOFnum(int a)
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


