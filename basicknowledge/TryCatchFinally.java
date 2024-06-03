package basicknowledge;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally 
{

	public static void main(String[] args) 
	{

		Scanner s1=new Scanner(System.in);
	try
	{
		int age = s1.nextInt();//it only accept int values if try to enter string we get inputmismatch to handle that added that exception in catch block
		System.out.println(age);
	}
   catch(InputMismatchException a1)
	{
	   System.out.println("Handled the exception");
	}
    finally
    {
    	System.out.println("thank you for visiting us,come again");
	}

	}

}
