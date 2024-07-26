package Aggregation;

public class student 
{
	String f_name;
	String l_name;
	int age;
	//pass a refernce varible addr here
	Address addr;
	//create a constructor and initialize all using this
	
	public student(String f_name,String l_name,int age,Address addr)
	{
		this.f_name=f_name;
		this.l_name=l_name;
		this.age=age;
		this.addr=addr;
		
	}
	
	public void display()
	{
		System.out.println("Fisrt Name:"+f_name);
		System.out.println("Last Name:"+l_name);
		System.out.println("Age:"+age);
		System.out.println("House Name:"+addr.house_name);
		System.out.println("Place:"+addr.place);
		System.out.println("District:"+addr.district);
		System.out.println("Pincode:"+addr.pincode);
	
	}

	
	public static void main(String[] args) 
	{
		Address obj1=new Address("Kalappurackal","Puthuppally","Kottayam", 686011);
		student obj2=new student("shani","George",29,obj1);
		obj2.display();

	}

}
