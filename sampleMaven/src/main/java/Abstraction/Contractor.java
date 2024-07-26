package Abstraction;

public class Contractor extends Employee {
    private int workingHours;

    public Contractor(String name, double paymentPerHour, int workingHours) 
    {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    public double calculateSalary() 
    {
        double a= paymentPerHour * workingHours;
        return a;
    }
}
