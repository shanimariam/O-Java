package sample;

public class StringReverse {

	public static void main(String[] args) 
	{
		int i;
		String s="Hello";
		String srev="";
		
		for(i=s.length()-1;i>=0;i--)
		{
			//charAt() method returns a char value at the given index number
			 srev= srev+s.charAt(i);
					
		}
		System.out.println(srev);
		
	}


}
/* 

StringBuffer s =new StringBuffer("Hello");
StringBuffer r= s.reverse();
System.out.println(r); 

*/