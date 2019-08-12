package arraytype;

public class TranseposeSquareMatrix 
{
	public static void main(String[] args) 
	{
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr[i].length;j++)
			{
				int t=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=t;
			}

		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]);
			}
	}
}
}
