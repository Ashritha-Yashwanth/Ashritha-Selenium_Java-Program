package basicknowledge;

public class Printing_Java 
{

	public static void main(String[] args) 
	{
     StringBuffer s1= new StringBuffer("Automation");//mutable
     s1=s1.append("Testing");//modified
     System.out.println(s1);
     
     String s2="Manual";//immutable
     s2= s2.concat("Testing");//created the new string
     System.out.println(s2);
	}

}
