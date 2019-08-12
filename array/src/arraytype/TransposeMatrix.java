package arraytype;

public class TransposeMatrix 
{
public static void main(String[] args) 
{
	int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int nm[][]=new int[arr[0].length-1][];
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			arr[j][i]=arr[i][j];
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

