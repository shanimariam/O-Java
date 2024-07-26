package Aggregation;

public class Book 
{

	String book_name;
	String book_language;
	Author at;
	
	public Book(String book_name,String book_language,Author at)
	{
		this.book_name=book_name;
		this.book_language=book_language;
		this.at=at;
	}
	public void display()
	{
		System.out.println("Book Name:"+book_name);
		System.out.println("Book Language:"+book_language);
		System.out.println("Author Name:"+at.author_name); // use .
		System.out.println("Author Age:"+at.author_age);//use .
	}
	
	
	public static void main(String[] args) 
	{
		Author obj1=new Author("Rollins",59);
		Book obj2=new Book("Harry Potter","English",obj1);
		obj2.display();

	}

}
