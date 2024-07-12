package inheritance;

public class Puppy extends Dog {

		public void display3()
		{
			System.out.println("This is child");
		}
		
			// TODO Auto-generated method stub
		public static void main(String[] args) 
		{

			Puppy obj=new Puppy();
			obj.display1();//method from grandparent is inherited
			obj.display2();//method from parent is inherited
			obj.display3();// method from own
			System.out.println(obj.a); // variable from parent is inherited
			
		
	   }

}
