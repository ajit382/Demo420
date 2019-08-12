package arraytype;

public class ReverseArray 
{
public static void main(String[] args) 
{
int a[]={25,41,74,8,49,554,65,87};
for(int i=0;i<a.length/2;i++)
{
	int t=a[i];
	a[i]=a[a.length-1-i];
	a[a.length-1-i]=t;
	
}
System.out.println("after reverse");
for(int j=0;j<a.length;j++)
{
	System.out.println(a[j]);
}

}
}
