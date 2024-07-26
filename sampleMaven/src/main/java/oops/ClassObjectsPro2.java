package oops;

public class ClassObjectsPro2 
{
	int a=10;
	
	public static void main(String args[])
	{
		classObjectPro1 obj=new classObjectPro1();// call another class obj in another class
		ClassObjectsPro2 obj1=new ClassObjectsPro2();
		ClassObjectsPro2 obj2=new ClassObjectsPro2();


	
	System.out.println(obj1.a);
	System.out.println(obj2.a);
	System.out.println(obj.a); // print the public/protected variable here 1
	}
}
