package arraytype;

public class CountOccuranceElement 
{
public static void main(String[] args) 
{
	int a[]={20,25,85,25,45,20,74,85,98};
	int n=a.length;
	for(int i=0;i<n;i++)
	{
		int count=1;
		for(int j=i+1;j<n;j++)
		{
			if(a[i]==a[j])
			{
				count++;
				a[j]=a[n-1];
				n--;
				j--;
			}
		}
		System.out.println(a[i]+"----"+count);
	}
}
}
