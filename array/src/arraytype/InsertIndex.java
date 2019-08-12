package arraytype;

public class InsertIndex 
{
	public static void main(String[] args)
	{
	int a[]={25,56,24,14,18};
	System.out.println("before insertaion");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	int index=3;
	int element=100;
	if(index<0 || index>a.length)
	{
		System.out.println("index not in range");
	}
	int na[]=new int[a.length+1];
	na[index]=element;
	for(int i=0;i<a.length;i++)
	{
		if(i<index)
			na[i]=a[i];
		else
			na[i+1]=a[i];
	}

	System.out.println("after deletion");
	for(int i=0;i<na.length;i++)
	{
		System.out.println(na[i]);
	}
	}
}
