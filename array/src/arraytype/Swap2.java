package arraytype;

public class Swap2 
{
	public static void main(String[] args)
	{
	int a[]={12,52,58,178,28};
	int k=0;
		if(a.length%2==0)
			k=a.length/2;
		else
			k=a.length/2+1;
		for(int i=0;i<a.length/2;i++,k++)
		{
			int t=a[i];
			a[i]=a[k];
			a[k]=t;
		}
		System.out.println("after swap");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
