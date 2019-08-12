package arraytype;

public class UnionArray 
{
public static void main(String[] args)
{
int a[]={12,52,58,178};
int b[]={8,56,52,12,74,25,24};
int u[]=new int[a.length+b.length];
for(int i=0;i<a.length;i++)
{
	u[i]=a[i];
}
int k=a.length;
for(int i=0;i<b.length;i++)
{
	boolean find =true;
	for(int j=0;j<a.length;j++)
	{
		if(b[i]==a[j])
		{
			find=false;
			break;
		}
		
	}
	if(find)
		u[k++]=b[i];
}
int nu[]=new int[k];
for(int i=0;i<k;i++)
{
	nu[i]=u[i];
}
for(int i=0;i<nu.length;i++)
{
	System.out.println(nu[i]);
}
}
}
