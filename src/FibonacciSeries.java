package amit;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int sum=0,n1=0,n2=1;
		for(int i=0;i<=10;i++)
		{
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
		}
	}

}
