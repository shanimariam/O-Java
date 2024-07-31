package Abstraction;

public class AbstarctionContractor extends AbstarctionEmployee
{
/*The Contractor class inherits all properties from its parent Employee
 *  but have to provide its own implementation of calculateSalary() method and multiply 
 *  the value of payment per hour with given working hours. 
 */
	
	//int  workingHours=6;
	
	 double paymentPerHour;
     int workingHours;
	public AbstarctionContractor(double paymentPerHour,int workingHours )
	{
		this.paymentPerHour = paymentPerHour;
        this.workingHours = workingHours;
	}
	
	void calculateSalary()
	{
		double sal=paymentPerHour*workingHours;
		System.out.println("Salary of the Contractor employee : "+sal);
		
	}

}
