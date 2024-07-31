package Abstraction;

import java.util.Scanner;

public class AbstarctionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the payment per hour for an employee:");
        double paymentPerHour = sc.nextDouble();

        System.out.println("Enter the working hours for Contractor employee:");
        int workingHours = sc.nextInt();

        AbstarctionContractor contractor = new AbstarctionContractor(paymentPerHour, workingHours);
        contractor.calculateSalary();

        AbstractionFullTimeEmployee fullTimeEmployee = new AbstractionFullTimeEmployee(paymentPerHour);
        fullTimeEmployee.calculateSalary();

        sc.close();
    }
}
