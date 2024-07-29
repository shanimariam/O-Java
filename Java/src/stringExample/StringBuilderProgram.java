package stringExample;

public class StringBuilderProgram 
{

	public static void main(String[] args) 
	{
		StringBuilder s=new StringBuilder("Chase");
		s.append(" your dreams");
		System.out.println(s); //chase your dreams
		
		s.insert(3,"A");
		System.out.println(s);//chaAse your dreams
		
		s.replace(2, 5, "oos");
		System.out.println(s);//choose your dreams
		
		s.reverse();
		System.out.println(s);
		
		s.delete(3, 6);
		System.out.println(s);

		
		
		
		
		
	}

}
