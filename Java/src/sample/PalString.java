package sample;
public class PalString 
{
	
	
	public static boolean check(String str) 
    {
        StringBuffer rev = new StringBuffer(str);
        rev.reverse();
        //convert the reversed string to string using toString()
        String s = rev.toString();
        return str.equalsIgnoreCase(s);
    }
	
	
    public static void main(String[] args) 
    {
        String str1 = "java";
        String str2 = "malayalam";

        System.out.println("Java :" + check(str1));
        System.out.println("malayalam :" + check(str2));
    }

    
}
