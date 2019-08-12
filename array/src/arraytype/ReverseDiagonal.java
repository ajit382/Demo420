package arraytype;

public class ReverseDiagonal
{
	public static void main(String[] args) 
	{
	int arr[][]= {{1,2,3,5},{4,5,6,9},{7,8,9,10}};
	for(int i=0;i<arr.length/2;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			if(i==j)
			{
				int t=arr[i][j];
				arr[i][j]=arr[arr.length-1-i][arr.length-1-j];
				arr[arr.length-1-i][arr.length-1-j]=t;
			}
		if(i+j==arr.length-1)
		{
			int t=arr[i][j];
			arr[i][j]=arr[j][i];
			arr[j][i]=t;
		}
		
	}
	for(int k=0;k<arr.length;k++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.println(arr[i][j]+" ");
		}
		System.out.println();
	}
	}
}
}

