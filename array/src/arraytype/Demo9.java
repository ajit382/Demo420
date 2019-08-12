package arraytype;

public class Demo9 
{
	
	public static void main(String[] args) 
	{
		int ar[]={20,35,48,-98,52,-74,75};
		int c[]=countEo(ar);
		System.out.println("number of positive number "+c[0]);
		System.out.println("number of negative number "+c[1]);
	}

	static int[] countEo(int[] a) 
	{
		int count[]={0,0};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=0)
			{
				count[0]++;     
			}
			else
			{
				count[1]++;
			}
		}
		return count;
	}
}
