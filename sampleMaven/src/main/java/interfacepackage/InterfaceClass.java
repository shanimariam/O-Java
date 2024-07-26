package interfacepackage;

public class InterfaceClass implements InterfaceP1,InterfaceP2
{
	
	public void display()
	{
		System.out.println("This is body of the method from interfaceP1");
	}
	
	public void display2() 
	{
		System.out.println("This is body of the method from interfaceP2");

		
	}

	public static void main(String[] args) 
	{
		InterfaceClass obj=new InterfaceClass();
		obj.display();
		obj.display2();
		System.out.println(obj.a);
		System.out.println(obj.s);



	}

}
