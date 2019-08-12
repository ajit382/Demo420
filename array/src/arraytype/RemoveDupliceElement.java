package arraytype;

public class RemoveDupliceElement 
{
	public static void main(String[] args)
	{
		int k=1;
	int a[]={12,52,58,178,72,12,52,58,718};
	int d[]=new int[a.length];
	d[0]=a[0];
	for(int i=1;i<a.length;i++)
	{
		boolean find =true;
		for(int j=0;j<k;j++)
		{
			if(a[i]==d[j])
			{
				find=false;
				break;
			}
			
		}
		if(find)
			d[k++]=a[i];
	}
	int nu[]=new int[k];
	for(int i=0;i<k;i++)
	{
		nu[i]=d[i];
	}
	for(int i=0;i<nu.length;i++)
	{
		System.out.println(nu[i]);
	}
	}
}
