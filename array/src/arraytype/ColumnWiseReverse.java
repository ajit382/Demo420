package arraytype;

public class ColumnWiseReverse 
{
	public static void main(String[] args) 
	{
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length/2;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				int t=arr[i][j];
				arr[i][j]=arr[arr.length-1-i][j];
				arr[arr.length-1-i][j]=t;
			}
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
