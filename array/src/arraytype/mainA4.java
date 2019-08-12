package arraytype;

public class mainA4 
{
		//creating method which returns an array  
		static int[] get()
		{  
		return new int[]{10,30,50,90,60};  
		}  
		public static void main(String args[])
		{  
		//calling method which returns an array  
		int arr[]=get();    
		for(int i=0;i<arr.length;i++)  
		System.out.println(arr[i]);
}
}
