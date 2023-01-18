package amit;

import java.util.Scanner;

public class PrimeNum {
	 static boolean isPrimeNum(int a) 
	 {
		 for(int i=2;i<=a/2;i++)
		 {
			 if(a%i==0)
				 return false;
		 }
		return true;
		
	 }

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int a=s.nextInt();
		for(int i=a;i>=2;i--)//for(int i=2;i<=a;i++)
			
			{
			boolean k = isPrimeNum(i);
			if(k==true)
				System.out.println(i);
		//	else
			//	System.out.println(i);
		}

	}

}
