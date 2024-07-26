package superpackage;

public class DivisibleChild extends DivParent 
{
	
	    public void checkDiv(int num1, int num2)
	    {
	        int result = super.sum(num1, num2);
	        
	        if (result % 10 == 0) 
	        {
	            System.out.println("Result is divisible by 10.");
	        } 
	        else 
	        {
	            System.out.println("Result is not divisible by 10.");
	        }
	    }
	    
	    public static void main(String[] args) 
	    {
	    	DivisibleChild obj = new DivisibleChild();
	        obj.checkDiv(10, 2);     
	    }
	}

