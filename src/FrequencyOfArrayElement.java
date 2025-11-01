package amit;

public class FrequencyOfArrayElement {

	public static void main(String[] args) {
		int[] a= {72,83,21,24,98};
		boolean[] b=new boolean[a.length];
		int count=0;
for(int i=0;i<a.length;i++)
{
	if(b[i]==false)
	{
		  count = 1;
	for(int j=0;j<a.length;j++)
	{
		if(a[i]==a[j])
			count++;
		b[i]=true;
	}
	}
	System.out.println(a[i]+"---->"+count);
}
}
}