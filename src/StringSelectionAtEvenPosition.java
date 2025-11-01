package amit;

public class StringSelectionAtEvenPosition {

	public static void main(String[] args) {
		String s="a1b2c3";
		String ar1=" ";
		String ar2=" ";
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
				ar1=ar1+ch[i];
			else
				ar2=ar2+ch[i];
		}
		System.out.println(ar1);
		System.out.println(ar2);

	}

}
