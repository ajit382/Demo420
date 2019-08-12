package arraytype;

public class ArrayZigZag 
{
public static void main(String[] args) 
{
int x[]={25,45,24,85,5};
int y[]={32,4,2,82,5,9,78,52,35};

int z[]=new int[x.length+y.length];
int i=0;
int j=0;
while(i<x.length && i<y.length)
{
	z[j++]=x[i];
	z[j++]=y[i++];
}
while(i<x.length)
{
	z[j++]=x[i++];
}
while(i<y.length)
{
	z[j++]=y[i++];
}
for(int k=0;k<z.length;k++)
{
	System.out.println(z[k]);
}

}
}
