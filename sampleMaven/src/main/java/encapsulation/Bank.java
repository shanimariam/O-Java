package encapsulation;

public class Bank 
{
    private int validPin1;
    private int validPin2;
    private int validPin3;

    public Bank() 
    {
        validPin1 = 1001;
        validPin2 = 1234;
        validPin3 = 1212;
    }

    public boolean validate(int epin) 
    {
        return epin == validPin1 || epin == validPin2 || epin == validPin3;
    }
}
