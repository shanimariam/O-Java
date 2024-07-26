package finalPackage;

public  class Program1 
{
	
	final int age; // final variable initilized in a constructor only
	//final int b=20;
	
	public Program1()
	{
		age=30;
	}
	
	public final void display()
	{
		System.out.println(age);
		//b=18; // error
	}
	
	
}
