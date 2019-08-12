package arraytype;

import java.util.Scanner;

public class Matrix
{
int[][] readMat()
{
	System.out.println("enter how many row and column");
	Scanner sc=new Scanner(System.in);
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
	return mat;
}
void dispMat(int mat[][])
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
int[][] addMat(int x[][],int y[][])
{
	if(x.length!=y.length || x[0].length!=y[0].length)
	{
		System.out.println("rows and column must be same");
	}
	int z[][]=new int[x.length][x[0].length];

	for(int i=0;i<x.length;i++)
	{
		for(int j=0;j<y[i].length;j++)
		{
			z[i][j]=x[i][j]+y[i][j];
		}
	
}
	return z;
}
int Negative(int x[][])
{
int count=0;
	for(int i=0;i<x.length;i++)
	{
		for(int j=0;j<x[i].length;j++)
		{
			if(x[i][j]<0)
				count++;
		}
	
}
	return count;
}
int Even(int x[][])
{
int countEven=0;
	for(int i=0;i<x.length;i++)
	{
		for(int j=0;j<x[i].length;j++)
		{
			if(x[i][j]%2==0)
				countEven++;
		}
	
}
	return countEven;
}
}
