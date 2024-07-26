package inheritance;

import java.util.Scanner;

// Parent class
class user 
{
    double basicPay;
    double deduction;
    double bonus;

    public void getDetails()  //get the details in a method using scanner
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Pay: ");
        basicPay = sc.nextDouble();

        System.out.print("Enter Deduction: ");
        deduction = sc.nextDouble();

        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();
        sc.close();
    }
}
class Calculator extends user //calculate class, to get the basic pay extend the class

{
     double hra;
     double pf;

    public void calculateHP() 
    {
        hra = 0.05 * basicPay;
        pf = 0.20 * basicPay;
    }

     double TotalSalary() 
    {
        return basicPay + hra - pf - deduction + bonus;
    }
}

public class Salary extends Calculator 
{
    public void generateSlip() 
    {
    	calculateHP(); // Calculate HRA and PF

        System.out.println("Payslip");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Deduction: " + deduction);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + TotalSalary());
    }
    public static void main(String[] args) 
    {
    	Salary obj = new Salary();

        obj.getDetails();
        obj.generateSlip();
    }
}
    
