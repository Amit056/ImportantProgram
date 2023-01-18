package amit;

import java.util.Scanner;

public class Compare3Digit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a num");
		int a=s.nextInt();
		System.out.println("enter a num");
		int b=s.nextInt();
		System.out.println("enter a num");
		int c=s.nextInt();
		int big=a;
		if(b>big)
			big=b;
		if(c>big)
			big=c;
		System.out.println(big+"----->bigest of all");
	}

}
