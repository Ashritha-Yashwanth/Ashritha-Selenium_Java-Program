package basicknowledge;
import java.util.Scanner;

public class ScannerAddSubMulDivMod
{
	
	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
        int number1 =  s1.nextInt(); //ask one input
        int number2 =  s1.nextInt(); //asks 2 inputs now
        
        int sum = number1+number2;
        System.out.println("The sum of two numbers are-> "+sum);

        int number3 =  s1.nextInt();
        int number4 =  s1.nextInt();
        int sub = number3-number4;
        System.out.println("The difference of two number are-> "+sub);
        
        int number5 =  s1.nextInt();
        int number6 =  s1.nextInt();
        int mul = number5*number6;
        System.out.println("The multiplication of two number are-> "+ mul);
        
        int number7 =  s1.nextInt();
        int number8 =  s1.nextInt();
        int div = number7/number8;
        System.out.println("The division of two number are-> "+div);
        
        int number9 =  s1.nextInt();
        int number10 =  s1.nextInt();
        int mod = number9%-number10;
        System.out.println("The modulus of two number are-> "+mod);

}
}