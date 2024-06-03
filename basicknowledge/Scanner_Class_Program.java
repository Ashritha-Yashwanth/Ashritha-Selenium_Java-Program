package basicknowledge;
import java.util.Scanner;

public class Scanner_Class_Program 
{

	public static void main(String[] args)
	{
       Scanner s1= new Scanner(System.in);
        int number1 =  s1.nextInt(); //ask one input
        int number2 =  s1.nextInt(); //asks 2 inputs now
        
        int sum = number1+number2;
        System.out.println("The sum of two numbers are-> "+sum);
	}

}

