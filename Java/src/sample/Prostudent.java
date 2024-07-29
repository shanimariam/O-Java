package sample;

public class Prostudent 
{

    public String method1() 
    {
        String s = "shani";
        return s;
    }

    public static void main(String[] args)
    {
        Prostudent obj = new Prostudent();
        String s = obj.method1(); 
        System.out.println("Name: " + s);
    }

}
