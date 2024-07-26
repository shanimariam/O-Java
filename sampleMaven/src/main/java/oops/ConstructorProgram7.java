package oops;

public class ConstructorProgram7 
{
	  int modelYear;
	  String modelName;

	  public ConstructorProgram7(int year, String name) {
	    modelYear = year;
	    modelName = name;
	  }

	  public static void main(String[] args) 
	  {
	    ConstructorProgram7 obj = new ConstructorProgram7(1969, "Mustang");
	    System.out.println(obj.modelYear + " " + obj.modelName);
	  }
	}

	// Outputs 1969 Mustang