package arraytype;

public class Demo3 
{
public static void main(String[] args) 
{
	//int ar[]=new int[5];
int ar[];//decleration
ar=new int[5];//allocation
ar[0]=43;
ar[1]=67;
ar[ar.length-1]=56;//inilization
for(int i=0;i<ar.length;i++)
{
	System.out.println(i+"------>>>>>    "+ar[i]);
}
}
}
