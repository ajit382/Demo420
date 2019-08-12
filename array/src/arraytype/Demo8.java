package arraytype;

public class Demo8 
{
public static void main(String[] args) 
{
	int ar[]={20,35,48,98,52,74,75};
	int c[]=countEo(ar);
	System.out.println("number of even number "+c[0]);
	System.out.println("number of even number "+c[1]);
}

static int[] countEo(int[] a) 
{
	int count[]={0,0};
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			count[0]++;     //count[a[i]%2}++
		}
		else
		{
			count[1]++;
		}
	}
	return count;
}
}
