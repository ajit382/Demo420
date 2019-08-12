package arraytype;

public class Demo6
{
public static void main(String[] args) 
{
	int ar[]={56,25,89,54,58};
	int b = getbiggest(ar);	
	int c = getsmallest(ar);
	System.out.println("bigger no is "+b+"  smaller no is "+c);
}

 static int getsmallest(int[] a)
 {
	 int small=a[0];
	 for(int i=1;i<a.length;i++)
	 {
		 if(a[i]<small)
			 small=a[i];
	 }
	return small;
	
}

static int getbiggest(int[] a) 
 {
	 int big=a[0];
	 for(int i=1;i<a.length;i++)
	 {
		 if(a[i]>big)
			 big=a[i];
	 }
	return big;
}
}
