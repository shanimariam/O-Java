package superpackage;

public class Parent 
{
	int a=20;
	public void method1()
	{
		System.out.println("This is first method from parent");
		
	}
	public void method2()
	{
		System.out.println("This is second method from parent");

		
	}
	public Parent(int num1,int num2)
	{
		System.out.println("This is a constructor from parent");
		int sum=num1+num2;
		System.out.println("Parent class Sum:"+sum);
	}
	public Parent()
	{
		System.out.println("Non parameterized constructor from parent");

	}

}
