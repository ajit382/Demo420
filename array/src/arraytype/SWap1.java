package arraytype;

public class SWap1 
{
public static void main(String[] args) 
{
	int a[]={25,56,24,14,18};
	for(int i=0;i<a.length-1;i=i+2)
	{
		int t=a[i];
		a[i]=a[i+1];
		a[i+1]=t;
	}
	System.out.println("after swap");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}
