package basicknowledge;

public class GlobalVariableDefaultValues
{
	 byte a1;
	static short a2;
	static long salary;
	static int age;
	float a3f;
	boolean a4;
	char a5;
	String name;
    static double weight;
	public static void main(String[] args) 
	{
		 GlobalVariableDefaultValues g1 = new  GlobalVariableDefaultValues();
		 System.out.println("default vale of byte " + "is " +  g1.a1);
		  System.out.println("default vale of short " + "is " + a2);
		  System.out.println("default vale of long " + "is " + salary);
		  System.out.println("default vale of int " + "is " + age);
		  System.out.println("default vale of float " + "is " + g1.a3f);
		  System.out.println("default vale of boolean " + "is " + g1.a4);
		  System.out.println("default vale of char " + "is " + g1.a5);
		  System.out.println("default vale of string " + "is " + g1.name);
		  System.out.println("default vale of double " + "is " + weight);
		  
	}

}
