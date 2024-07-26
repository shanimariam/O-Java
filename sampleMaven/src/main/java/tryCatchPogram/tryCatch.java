package tryCatchPogram;

public class tryCatch {

	public static void main(String[] args) 
	{
		int a=10;
		int ar[]=new int[2];
		int b=6;
		
		try
		{
		int d=a/0;
		ar[3]=5;
		}
		
		 /*catch(ArithmeticException e)
		{
		System.out.println("ArithmeticException");
		System.out.println(a);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		
		catch(Exception e)
		{
			System.out.println("Parent Exception");
			System.out.println(e);
		}
		*/
		finally
		{
			System.out.println("Execution must even catch is not there or not");
		}
		System.out.println("this code will not execute if there is no catch");

	}

}
