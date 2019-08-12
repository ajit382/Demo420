package arraytype;

public class Spiral 
{
	
	public static void main(String[] args)
	{
		int m[][]={{2,3,5,7,1},{6,9,4,8,7},{1,3,5,7,8},{9,8,4,2,6},{6,9,7,5,4}};
		int n=m.length;
		for(int i=0,j=n-1;i<j;i++,j--)
		{
			for(int k=i;k<j;k++)
			{
				System.out.println(m[i][k]+" ");
			}
			for(int k=i;k<j;k++)
			{
				System.out.println(m[k][j]+" ");
			}
			for(int k=j;k>i;k--)
			{
				System.out.println(m[j][k]+" ");
			}
			for(int k=j;k>i;k--)
			{
				System.out.println(m[k][i]+" ");
			}
		
		}
		if(n%2==1)
			System.out.println(m[n/2][n/2]);
	}
}
