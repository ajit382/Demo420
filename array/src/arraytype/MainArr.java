package arraytype;

public class MainArr 
{
public static void main(String[] args) 
{
Matrix o=new Matrix();
System.out.println("enter 1st matrix element");
int a[][]=o.readMat();
System.out.println("enter 2nd matrix element");
	int b[][]=o.readMat();
	System.out.println("entered ist matrix element");
	o.dispMat(a);
	System.out.println("entered 2nd matrix element");
	o.dispMat(b);
	int c[][]=o.addMat(a, b);
	if(c!=null)
	{
		System.out.println("sumof a and b matrix");
		o.dispMat(c);	
}
	int n=o.Negative(a);
	System.out.println("total no of negative element "+n);
	int even=o.Even(a);
	System.out.println("total no of even element "+even);
}
}
