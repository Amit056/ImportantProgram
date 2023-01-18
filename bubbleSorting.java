package amit;

public class bubbleSorting {

	public static void main(String[] args) {
		int[] a= {72,83,21,24,98};
		int temp=0;
for(int i=0;i<a.length;i++)// No. of execution=Number of Passes=(Length-1);
{ 
	for(int j=0;j<a.length-1;j++)//for 1 outer for-loop it EXECutes 4 times;
	{
		//for AScending order
		if(a[j]>a[j+1])//for descending order a[j]<a[j+1] 
		{
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}
		
		
	}
	}
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
	}
System.out.println("2nd (largest and smallest number)");
System.out.println(a[1]+":------>2nd smallest num");
System.out.println(a[a.length-2]+":------>2nd largest num");

	}

}
