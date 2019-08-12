package arraytype;

public class MinusOperation 
{
	public static void main(String[] args) 
	{
	int a[]={12,52,58,178};
	int b[]={8,56,52,12,74,25,24};
	int u[]=new int[a.length];
	int k=0;
	for(int i=0;i<a.length;i++)
	{
		boolean find =true;
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
			{
				find=false;
				break;
			}
			
		}
		if(find)
			u[k++]=a[i];
	}
	int minus[]=new int[k];
	for(int i=0;i<k;i++)
	{
		minus[i]=u[i];
	}
	for(int i=0;i<minus.length;i++)
	{
		System.out.println(minus[i]);
	}
	}
}
