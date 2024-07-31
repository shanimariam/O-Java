package Abstraction;

public class AbstractionFullTimeEmployee extends AbstarctionEmployee
{
	/*
	 * The FullTimeEmployee also has its own implementation of calculateSalary()method.
	 *  In this case we just multiply by constant 8 hours.
	 */
	
	private double paymentPerHour;

    public AbstractionFullTimeEmployee(double paymentPerHour)
    {
        this.paymentPerHour = paymentPerHour;
    }

	void calculateSalary()
	{
		final int CONSTANT_HOUR =8;

		double fsal=paymentPerHour*CONSTANT_HOUR;
		System.out.println("Salary of the Full time employee : "+fsal);
	}

}
