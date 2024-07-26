package accessModifier1;

public class Classone 
{
	
	public int a=10;
	public void display()
	{
		System.out.println("class one variable A : " +a);
	}

	public static void main(String[] args) 
	
	{
		Classone obj=new Classone();
				obj.display();

	}

}
