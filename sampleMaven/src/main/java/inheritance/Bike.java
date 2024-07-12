package inheritance;

public class Bike extends Vehicle
{
	public void display3()
	{
		System.out.println("This is child 2: Bike");
	}
	public static void main(String[] args) 
	{
		Bike obj =new Bike();
		obj.display1();
		obj.display3();
		//obj.display2();
		Car obj1=new Car(); // either we should create an obj for second child in this child or create a main method in second child
		obj1.display2();
		System.out.println(obj.s); // vehicle
		System.out.println(obj1.s);//vehicle
 

		
	}
	
}
