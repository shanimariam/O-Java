package collectionPro;

import java.util.ArrayList;
import java.util.List;

public class StringData {

	public static void main(String[] args) 
	{
		List l1=new ArrayList(); // non generic list created without datatype so we can add any datatypes
		l1.add("shani");
		l1.add(12);
		l1.add(10.5);
		l1.add('c');
		
		System.out.println(l1);
		System.out.println(l1.isEmpty());
		

		List<String>l2=new ArrayList(); //generic with datatype
		l2.add("sachin");
		l2.add("mathew");
		l2.add(0,"banana");//add banana to 0th position
		l2.add(1,"apple");//add banana to 1th position
		System.out.println(l2);//[banana, apple,sachin, mathew]
		System.out.println(l2.size());//4
		System.out.println(l2.contains("banana")); //true
		
		l2.add(null); // allow null value
		l2.add(null);
		l2.add("banana");// allow repetaed values
		System.out.println(l2);//[banana, apple, sachin, mathew, null, null, banana]

		 System.out.println("************");
		System.out.println("Using for loop");
		 System.out.println("************");

		
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
			
		}
		 System.out.println("************");
		 System.out.println("Using foreach work only for generic");
		 System.out.println("************");
		for(String i :l2)
		{
			System.out.println(i);
		}

	}

	

}
