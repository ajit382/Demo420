package arraytype;

public class MergeSort 
{
	public static void main(String[] args) 
	{
	int x[]={8,14,18,25};
	int y[]={10,12,16,20,22,24};

	int z[]=new int[x.length+y.length];
	int i=0;
	int j=0;
	int k=0;
	while(i<x.length && j<y.length)
	{
		if(x[i]<y[j])
			z[k++]=x[i++];
		else
			z[k++]=y[j++];
		
	}
	while(i<x.length)
	{
		z[k++]=x[i++];
	}
	while(j<y.length)
	{
		z[k++]=y[j++];
	}
	for(int b=0;b<z.length;b++)
	{
		System.out.println(z[b]);
	}

	}
}
