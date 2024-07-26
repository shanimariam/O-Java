package superpackage;

public class Child extends Parent 
{

	int a=10;

	public Child()
	{
		System.out.println("Non parameterized constructor from child");

	}
	public Child(int num1,int num2)
	{
		//super implicit call,so it will call parent class
		super(6,2);
		int sum=num1+num2;
		System.out.println("This is a child constructor");
		System.out.println(a);
		System.out.println(super.a);
		System.out.println("Child Class Sum:" +sum);
		super.method1();
	}
	public void method1()
	{
		super.method1();//parent method
		super.method2();
		System.out.println("This is a method from child");
		
	}
	
	public static void main(String[] args) 
	{
		//Child obj2=new Child();
		Child obj=new Child(5,2);
		obj.method1();
		obj.method2();

	}

}
