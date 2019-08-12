package arraytype;

public class IntersectionArray 
{
	public static void main(String[] args) 
	{
		int a[]={12,52,58,74};
		int b[]={8,56,52,12,74,25};
		int in[]=new int[a.length];
		
	int k=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
			{
				in[k++]=a[i];
				break;
			}
		}
	}
	int inter[]=new int[k];
	for(int i=0;i<k;i++)
	{
		inter[i]=in[i];
	}
	for(int i=0;i<inter.length;i++)
	{
		System.out.println(inter[i]);
	}
}
}
