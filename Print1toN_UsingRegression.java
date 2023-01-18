package amit;

import java.util.Scanner;

public class Print1toN_UsingRegression {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a num");
		int a = s.nextInt();
		int k = display(a);
		System.out.println(k);
	}

	// print N to 1;
	/*
	 * static void display(int x) { System.out.println(x); if(x>1) display(x-1);
	 * 
	 * }
	 */
//print sum of N digits
	/*static int display(int x)
	  {
		if (x==0) 
			return 0;
		
			return x+display(x - 1);
}*/
	//print product of N digits
	static int display(int x)
	  {
		if (x==0) 
			return 1;
		
			return x*display(x - 1);
	  }
}
