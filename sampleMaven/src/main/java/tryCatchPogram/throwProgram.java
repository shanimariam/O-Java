package tryCatchPogram;

public class throwProgram
{
	public static void method(int a,int b)
	{
		int sum=a+b;
		if(sum>10)
		{
			throw new ArithmeticException("Sum is greater than 10");
			
		}
		else
		{
			System.out.println("less than 10");
		}
		
	}

	public static void main(String[] args) 
	{
		try
		{
		throwProgram.method(5,6);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Should print this statement");
		}
		System.out.println("rest of the code");

	}

}
