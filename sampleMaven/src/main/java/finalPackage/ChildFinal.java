package finalPackage;

public class ChildFinal  extends Program1
{ // cannot create a child for final parent
	public final void display()
	{
		System.out.println(age);
	}

	public static void main(String[] args)
	
	{
		Program1 obj=new Program1();
				obj.display();
	}


}
