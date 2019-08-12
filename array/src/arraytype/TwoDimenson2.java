package arraytype;

import java.util.Scanner;

public class TwoDimenson2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in)	;
System.out.println("enter how many row and column");
int r=sc.nextInt();
int c=sc.nextInt();

int mat[][]=new int[r][c];
System.out.println("enter "+r*c+" elements row wise");
for(int i=0;i<mat.length;i++)
{
	for(int j=0;j<mat[i].length;j++)
	{
		mat[i][j]=sc.nextInt();
	}
}
System.out.println("entered matrix");
{
	for(int i=0;i<mat.length;i++)
	{
		for(int j=0;j<mat[i].length;j++)
		{
			System.out.print(mat[i][j]+" ");
		}
		System.out.println();
	}	
}
}
}
