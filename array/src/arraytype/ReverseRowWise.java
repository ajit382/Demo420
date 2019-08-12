 package arraytype;

public class ReverseRowWise 
{
	public static void main(String[] args) 
	{
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length/2;j++)
			{
				int t=arr[i][j];
				arr[i][j]=arr[i][arr[i].length-1-j];
				arr[i][arr[i].length-1-j]=t;
			}
			System.out.println();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
		}
}
