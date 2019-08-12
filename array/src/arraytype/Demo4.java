package arraytype;

import java.util.Scanner;

public class Demo4
{
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in)	;
System.out.println("enter how many value you have");
int n=s.nextInt();
int ar[]=new int[n];
for(int i=0;i<n;i++)
{
	ar[i]=s.nextInt();
}
System.out.println("entered array element ");
int p=1;
for(int i=0;i<ar.length;i++)
{
System.out.print(ar[i]+" ");
p=p*ar[i];

}
System.out.println();
System.out.println("product is "+p);

}
}
