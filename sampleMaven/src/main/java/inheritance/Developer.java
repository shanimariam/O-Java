package inheritance;

public class Developer extends Employee
{
	public void print()
	{
		System.out.println("This is child");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Developer obj=new Developer();
		obj.display();
		obj.print();
		System.out.println(obj.a);
	} 

}
