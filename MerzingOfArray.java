package amit;

public class MerzingOfArray {
static	int[] mergeTwoArray(int[] x,int[] y)
	{
	int[] z=new int[x.length+y.length];
	for(int i=0;i<x.length;i++)
	{
		if(i<x.length)
			z[i]=x[i];
	}
	for(int i=0;i<y.length;i++)
	{
		if(i<y.length)
			z[i+x.length]=y[i];
	}
	return z;
	}
	public static void main(String[] args) {
		int[] a= {12,23,21,34,45};
		int[] b= {33,45,12};
		int[] k = mergeTwoArray(a,b);
		
		for(int i=0;i<k.length;i++)
		{
			System.out.println(k[i]);
		}
	}

}
