package polymorphism;

public class Child extends Parent
{
	public void method1(int d,int e) // variable can be different
	{
		super.method1(4, 2); 
		int s=d+e;
		System.out.println("Child Class Sum:"+s);
	}

	public static void main(String[] args) 
	{
		Parent obj=new Child();
		obj.method1(5,5);
		

	}

}
