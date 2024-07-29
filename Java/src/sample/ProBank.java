package sample;

public class ProBank 
{
	long account;
	String email;
	public ProBank(long account,String email)
	{
		this.account=account;
		this.email=email;
		
	}

	public static void main(String[] args) 
	{

		ProBank obj1=new ProBank(123456789,"shanimariamgeorge@gmail.com");
		ProBank obj2=new ProBank(98765432,"Test@gmail.com");
		System.out.println(obj1.account);
		System.out.println(obj1.email);
		System.out.println(obj2.account);
		System.out.println(obj2.email);

 
		
	}

}
