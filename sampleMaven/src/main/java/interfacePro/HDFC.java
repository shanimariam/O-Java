package interfacePro;

public class HDFC implements RBI {


public double recurringDeposit(double amount, int duration) 
 {
     double interest = amount * INTEREST * duration;
     double rd= amount + interest;
     return rd;
     
 }

 public static double printInterest() 
 {
     return RBI.INTEREST;
 }

 public static void main(String[] args) 
 {
     HDFC obj = new HDFC();
     double amountDeposited = obj.recurringDeposit(5000, 2);
     System.out.println("Amount after depositing"+ amountDeposited);
     System.out.println("Interest Rate: " + HDFC.printInterest());
 }
}
