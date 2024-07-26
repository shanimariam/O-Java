package encapsulation;

import java.util.Scanner;

public class User 
{
    public int getPin() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        int epin = sc.nextInt();
        return epin;
    }


    public static void main(String[] args) 
    {
        Bank bank = new Bank();
        User user = new User();

        int epin = user.getPin();

        if (bank.validate(epin)) 
        {
            System.out.println("Valid Pin");
        } 
        else 
        {
            System.out.println("Invalid Pin");
        }
    }
}
