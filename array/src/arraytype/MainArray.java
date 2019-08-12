package arraytype;

public class MainArray 
{
public static void main(String[] args) 
{
ArrayOperation o=new ArrayOperation();
System.out.println("Array elements");
int a[]=o.readArry();
o.DisaArr(a);
int sum[]=o.sumEo(a);
System.out.println("sum of even no "+sum[0]);
System.out.println("sum of even no "+sum[1]);
System.out.println("enter array elements");
int x[]=o.readArry();
int y[]=o.readArry();
int m[]=o.merge(x, y);
o.DisaArr(m);

}
}
