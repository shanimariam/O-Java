package Abstraction;

	public class FullTimeEmployee extends Employee 
	{
	    private static final int CONSTANT = 8;

	    public FullTimeEmployee(String name, double paymentPerHour)
	    {
	        super(name, paymentPerHour);
	    }

	    public double calculateSalary() 
	    {
	        return paymentPerHour * CONSTANT;
	    }
	public static void main(String[] args) 
	{
		
		        Contractor contractor = new Contractor("shani", 25.0, 40);
		        System.out.println(contractor.calculateSalary()); 

		        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("sachin", 30.0);
		        System.out.println(fullTimeEmployee.calculateSalary());

	}

}
