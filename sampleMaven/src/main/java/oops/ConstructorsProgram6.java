package oops;

public class ConstructorsProgram6 
{
	int x;  // Create a class attribute

	  // Create a class constructor for the Main class
	  public ConstructorsProgram6() 
	  {
	    x = 5;  // Set the initial value for the class attribute x
	  }

	  public static void main(String[] args)
	  {
		  ConstructorsProgram6 myObj = new ConstructorsProgram6(); // Create an object of class ConstructorsProgram6 (This will call the constructor)
	      System.out.println(myObj.x); // Print the value of x
	  }
	}
