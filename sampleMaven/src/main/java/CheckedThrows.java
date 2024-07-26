import java.io.IOException;

public class CheckedThrows 
{
	
	public static void method()throws IOException
	{
		throw new IOException("exception");
	}

	public static void main(String[] args) throws IOException 
	{
		CheckedThrows.method();
	}

}
