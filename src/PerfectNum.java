package amit;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a num");
		int n=s.nextInt();
		int k = isPerfectNum(n);
		if(k==n)
			System.out.println(n+":is a perfect num");
		else
			System.out.println(n+":is not a perfect num");
	}
	static int isPerfectNum(int x)	
	{
		int sum=0;
		for(int i=1;i<=x/2;i++)
		{
			if(x%i==0)
				sum=sum+i;
		}
		return sum;
	}

}
