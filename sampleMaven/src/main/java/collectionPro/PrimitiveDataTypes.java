package collectionPro;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveDataTypes {

	public static void main(String[] args) 
	{
		 System.out.println("INTEGER");
		 System.out.println("-----------------");
		
		List<Integer>li=new ArrayList();
		li.add(12);
		li.add(46);
		li.add(4);
		 System.out.println(li);
		 System.out.println("************");
		 System.out.println("Using foreach work only for generic-single data type not mixed data types");
		 System.out.println("************");
		 
		for(Integer i:li)
		{
			System.out.println(i);
		}
		
		
		 System.out.println("-----------------");
		 System.out.println("Character");
		 System.out.println("-----------------");
		 
		 List <Character> li2=new ArrayList();
		 li2.add('a');
		 li2.add('b');
		 for(Character i:li2)
			{
				System.out.println(i);
			}
		 
		 System.out.println("-----------------");
		 System.out.println("Double");
		 System.out.println("-----------------");
		 
		 List <Double> li3=new ArrayList();
		 li3.add(10.2);
		 li3.add(3.6);
		 for(Double i:li3)
			{
				System.out.println(i);
			}
		 
		 System.out.println("-----------------");
		 System.out.println("Float");
		 System.out.println("-----------------");
		 
		 List <Float> li4=new ArrayList();
		 li4.add(0.2F);
		 li4.add(0.6F);
		 for(Float i:li4)
			{
				System.out.println(i);
			}
	
	

	}

}
