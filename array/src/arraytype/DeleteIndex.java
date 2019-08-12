package arraytype;

public class DeleteIndex 
{
public static void main(String[] args) 
{
int a[]={25,56,24,14,18,17,29};
System.out.println("before deletion");
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
int index=2;
if(index<0 || index>=a.length)
{
	System.out.println("index not in range");
}
int na[]=new int[a.length-1];
for(int i=0;i<a.length-1;i++)
{
	if(i<index)
		na[i]=a[i];
	else
		na[i]=a[i+1];
}

System.out.println("after deletion");
for(int i=0;i<na.length;i++)
{
	System.out.println(na[i]);
}
}
}
