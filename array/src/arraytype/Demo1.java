package arraytype;

public class Demo1
{
public static void main(String[] args) 
{
int ar[]={45,67,89,65,43};
System.out.println(ar);
System.out.println("number of element"+ar.length);
System.out.println("1st element"+ar[0]);
System.out.println("last  element"+ar[ar.length-1]);
for(int i=0;i<ar.length;i++)
{
	System.out.println(" "+i+" "+ar[i]);
}


}
}
