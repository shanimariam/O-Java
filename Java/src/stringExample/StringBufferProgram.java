package stringExample;

public class StringBufferProgram 
{

	public static void main(String[] args) 
	{
		StringBuffer s=new StringBuffer("Chase");
		StringBuffer s1=new StringBuffer();

		
		s.append("your dreams");
		System.out.println(s);
		s.insert(3,"A");
		System.out.println(s);
		s.replace(2, 5, "we");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		s.delete(3, 6);
		System.out.println(s);
		System.out.println(s1.capacity());//default capacity is 16
		s1.append("hello java is simple");
		System.out.println(s1.capacity());//old capacity*2+2
		s1.ensureCapacity(12); //it ensures min capacity
		s1.append("hello");
		System.out.println(s1.capacity());

		
		
		
	}

}
