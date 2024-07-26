package oops;

public class AttributePro3
{
	int x = 5;
	final int y=25;

	  public static void main(String[] args) 
	  {
		  AttributePro3 obj = new AttributePro3();
	      System.out.println(obj.x); //5

		  obj.x=10; // attribute value modified
		  //obj.y=30; -->this will lead error .The final keyword is useful when you want a variable to always store the same value
	      System.out.println(obj.x);//10
	  }
	}