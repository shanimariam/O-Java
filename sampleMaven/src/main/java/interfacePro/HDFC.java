package interfacePro;

import java.util.Scanner;

public class HDFC implements RBI {


public double recurringDeposit() 
 {
	    Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the amount");
		double amount=sc.nextDouble();
		
		System.out.println("Enter the duration");
		int duration=sc.nextInt();
		
		
     double interest = amount * INTEREST * duration;
     double rd= amount + interest;
     return rd;
 }
 

 public static void main(String[] args) 
 {
     HDFC obj = new HDFC();
     double amountDeposited = obj.recurringDeposit();
     System.out.println("Amount after depositing"+ amountDeposited);
     System.out.println("Interest Rate: " + INTEREST);
 }
}
