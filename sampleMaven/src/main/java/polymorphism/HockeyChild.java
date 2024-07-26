package polymorphism;

public class HockeyChild extends GameParent
{
	
	public void play()
	{
		super.play();
		System.out.println("This is Hockey");		
	}


	public static void main(String[] args) 
	{
		GameParent obj1=new HockeyChild();
		GameParent obj2=new CricketChild();
		GameParent obj3=new FootballChild();

		obj1.play();
		obj2.play();
		obj3.play();
		
		
		/* OR
		 * G
		 */
		

	}

}
