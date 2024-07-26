package encapsulation;

public class sample 
{
	
	private long accountId;
	private String email;
	private float balance;
	
	
	public void setAccountId(long accountId) 
	{
		this.accountId = accountId;
	}
	
	public long getAccountId() 
	{
		return accountId;
	}
	
	
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public float getBalance()
	{
		return balance;
	}
	public void setBalance(float balance)
	{
		this.balance = balance;
	}
	
}
