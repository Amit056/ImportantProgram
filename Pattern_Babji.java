package amit;

public class Pattern_Babji {
	public static void main(String[] args) {
		String s="BABJI";
		char[] ch=s.toCharArray();
for(int i=0;i<ch.length;i++)
{
	for(int j=0;j<=i;j++)
	{
		System.out.print(ch[j]+"");
	}
	System.out.println("");
	}
	}

}
