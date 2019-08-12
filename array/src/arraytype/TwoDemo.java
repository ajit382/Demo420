package arraytype;

public class TwoDemo 
{
	public static void main(String[] args) 
	{	
int x[][]={{3,4,5},{4,8,6,7},{7,8}};
System.out.println(x[1][1]);
System.out.println(x[1][x[1].length-1]);
for(int i=0;i<x.length;i++)//no of row
{
	for(int j=0;j<x[i].length;j++)//no of element
	{
		System.out.println(x[i][j]+" ");
	}
	System.out.println();
}

}
}
