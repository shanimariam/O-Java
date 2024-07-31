package tryCatchPogram;
public class UncheckedThrows 
{

	public static void method() throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		int a=10;
		if(a>=10)
		{
		throw new ArithmeticException("Arithmetic Exception greater than 10");
		}
		else
		{
		throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException less tha 10 ");

		}
			
	}
	public static void main(String[] args)
	{
		UncheckedThrows.method();
	}

}
