package excelread;

import java.io.IOException;

public class Excelread 
{
	public static void main(String[] args) throws IOException 
	{
		String s=ExcelExample.readStringData(1, 0);
		System.out.println(s);
		
		String m=ExcelExample.readIntegerData(1, 1);
		System.out.println(m);
		
	}

}
