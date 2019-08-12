package arraytype;

public class pairSum
{
public static void main(String[] args)
{
int a[]={4,5,1,2,6,7,3};
int sum=10;
for(int i=0;i<a.length-1;i++)// last element no need to check
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]+a[j]==sum)
		{
			System.out.println("pair of element "+a[i]+"   "+a[j]);
		}
	}
}
}
}
