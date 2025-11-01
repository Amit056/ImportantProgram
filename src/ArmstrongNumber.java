import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter ist number");
		int n1 = s.nextInt();
		   int m = countOfDigit(n1);
		   int sum=0;
		   while(n1!=0) {
			   int b=n1%10;
         int k = powerOfNumber(b,m);
         sum=sum+k;
       //  System.out.println(sum);
         n1=n1/10;
		   }
		   System.out.println(sum);

	}
	public static int powerOfNumber(int a,int b)
	{
		int product=1;
		while(b!=0)
		{
			product=product*a;
			b--;
		}
		return product;
	}
public static int countOfDigit(int a)
{
	int count=0;
	while(a!=0)
	{
		int b=a%10;
		count++;
		a=a/10;
		
	}
	return count;
	
	}
//kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
}
