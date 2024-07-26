package encapsulation;

public class SampleMain {

	public static void main(String[] args) 
	{
		sample obj=new sample();
		obj.setAccountId(123456789);
		obj.setBalance(5000);
		obj.setEmail("shanimariamgeorge@gmail.com");
		System.out.println("Account id"+obj.getAccountId());
		System.out.println("Balance"+obj.getBalance());
		System.out.println("Email" +obj.getEmail());

	}

}
