package arraytype;

public class Demo7 
{
public static void main(String[] args) 
{
int ar[]={52,25,25,65,25,20,85,25};
int c=countOccurance(ar,25);

System.out.println("no of occurance is "+c+"  times");
}

 static int countOccurance(int[] ar, int j) 
 {
	int count=0;
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]==j)
			count++;
	}
	return count;
}
}
