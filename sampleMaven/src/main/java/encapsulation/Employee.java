package encapsulation;

public class Employee 
{

	private String name;
	private String designation;
	private int salary;
	
	
	
	public void setter(String name,String designation,int salary)
	{
		 this.name=name;
		 this.designation=designation;
		 this.salary=salary;
	}
	
	
	public void getter()
	{
		System.out.println("Name:"+name);
		System.out.println("Role"+designation);
		System.out.println("salary"+salary);
	}
}
