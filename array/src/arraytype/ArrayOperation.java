package arraytype;

import java.util.Scanner;

public class ArrayOperation
{
int[] readArry()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("how many value you have");
	int n=sc.nextInt();
	int ar[]=new int[n];
	System.out.println("enter "+n+" values");
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}
	return ar;	
}
void DisaArr(int ar[])
{
	for(int i=0;i<ar.length;i++)
	{
		System.out.println(ar[i]+" ");
	}
	System.out.println();
}
int[] sumEo(int ar[])
{
	int sum[]={0,0};
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]%2==0)
		{
			sum[0]=	sum[0]+ar[i];
		}
		else
		{
			sum[1]=	sum[1]+ar[i];
		}
	}
	return sum;
}
int[] merge(int x[],int y[])
{
	int z[]=new int[x.length+y.length];
	for(int i=0;i<x.length;i++)
	{
		z[i]=x[i];
	}
	for(int i=0;i<y.length;i++)
	{
		z[i+x.length]=y[i];
	}
	return z;	
}
}
