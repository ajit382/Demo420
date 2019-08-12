package arraytype;

public class InsretArry 
{

	public static void main(String[] args)
	{
	int a[]={25,56,24,14,18};
	int b[]={21,22,45,85};
	int index=3;
	if(index<0 || index>a.length)
	{
		System.out.println("index not in range");
	}
	int na[]=new int[a.length+b.length];
	for(int i=0;i<b.length;i++)
	{
		na[index+i]=b[i];
	}

	for(int i=0;i<a.length;i++)
	{
		if(i<index)
			na[i]=a[i];
		else
			na[i+b.length]=a[i];
	}
	System.out.println("after insertation");
	for(int i=0;i<na.length;i++)
	{
		System.out.println(na[i]);
	}
	}
}
