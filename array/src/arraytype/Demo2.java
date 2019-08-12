package arraytype;

public class Demo2 
{
public static void main(String[] args) 
{
int ar[];
ar=new int[]{65,52,4,55,45,78};
int sum=0;
for(int i=0;i<ar.length;i++)
{
	sum=sum+ar[i];
}
System.out.println("sum of element is "+sum);
System.out.println("avg is "+sum/ar.length);
}
}
