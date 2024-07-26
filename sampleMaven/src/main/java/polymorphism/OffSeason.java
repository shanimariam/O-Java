package polymorphism;
import java.util.Scanner;


public class OffSeason extends OnSeason 
{
	
	public void discount(float p)
	{
	//super.discount(p);
	float of_price_discount=p*0.60f;
	System.out.println("OffSeason Discount"+of_price_discount);
	float of_new_price=p-of_price_discount;
	System.out.println("New Price after Discount on off season"+of_new_price);
	
	}
	
	

	public static void main(String[] args) 
	{		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price of cloth");
		float price=sc.nextFloat();
		 OffSeason obj1=new OffSeason();
		 OnSeason obj2=new OnSeason();
		 
		 
	while(true)
	{
		System.out.println("Select an option");
		System.out.println("1. Offseason discount");
        System.out.println("2. Onseason discount");
		int option =sc.nextInt();
		
		switch (option) 
		{
            case 1:obj1.discount(price);
                    break;
            case 2:obj2.discount(price);
            		break;
            default:System.out.println("Invalid");
                break;
        }

	}

  }
}
