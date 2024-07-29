package stringExample;

public class StringPrograms {

	public static void main(String[] args) 
	{
		
		String s1=" shani";
		String s2="SHANI";
		String s3="Anila";
		String s4="Anila";
		String s5="java is simple";
		int i6=30;
		
//string literal and new keyword in heap memory
		
	String s="welcome"; //welcome is stored in String constant pool of heap memory
	s.concat("to testing world"); // it will not concat until it is assigned to s
	System.out.println(s);  //output is welcome
				
	String a="welcome";
	a= a.concat("to testing world");
    System.out.println(a); //welcome to testing world
			    
	String b= new String("happy"); //happy is stored in heap memory but outside of string constant pool
	System.out.println(b); //happy
	System.out.println("*********");
		    
		
//STRING COMPARISONS- EQUALS(),==OPERATOR,COMPARE TO METHOD
	System.out.println(s1.equals(s2));// false
	System.out.println(s1.equalsIgnoreCase(s2));	//true	
	System.out.println(s1.compareTo(s2)); // same alphabet return true 
	System.out.println(s1.compareTo(s3)); // S>A Positive number us shown
	System.out.println(s3.compareTo(s2)); // A>S--negative number is shown
	System.out.println(s3==s4); //Return true
	System.out.println("*********");

//Length
	System.out.println(s1.length());//6 includes whitespaces
	System.out.println("*********");

//UPPERCASE AND LOWERCASE
	System.out.println(s1.toUpperCase()); // SHANI
	System.out.println(s2.toLowerCase()); //shani
	System.out.println("*********");

//trim
	System.out.println(s1.trim());
	System.out.println("*********");

//replace
	System.out.println(s5.replace("simple", "powerful"));
	System.out.println("*********");

//Startswith and Endwith
	System.out.println(s1.startsWith("s")); // false becuase it starts with space
	System.out.println(s1.startsWith(" ")); // true  becuase it starts with space
	System.out.println(s3.startsWith("a"));// false because it starts with capital A
	System.out.println(s3.startsWith("A"));// TRUE because it starts with capital A
	System.out.println(s1.endsWith("i")); //true because it ends with i
	System.out.println(s1.endsWith("I")); //false  because it ends with i
	System.out.println("*********");
//valueof
	System.out.println(String.valueOf(i6)); //30
	System.out.println(String.valueOf(i6+10)); //40
	System.out.println("*********");
	String s6=String.valueOf(i6); //30
	System.out.println(String.valueOf(s6+10)); //3010
	System.out.println("*********");

//contains
	System.out.println(s5.contains("java")); //true

	
	}

}
