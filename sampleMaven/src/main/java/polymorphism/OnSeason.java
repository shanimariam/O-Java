package polymorphism;

public class OnSeason 
{
	public void discount(float orginal_price)
	{
		float on_price_discount=orginal_price*0.40f;
		System.out.println("OnSeason Discount"+on_price_discount);
		float on_new_price=orginal_price-on_price_discount;
		System.out.println("New Price after Discount on on season"+on_new_price);
	}

}
