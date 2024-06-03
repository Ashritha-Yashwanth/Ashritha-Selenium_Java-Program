package basicknowledge;
import java.util.Scanner;

public class ScannerClassWithNext 
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		byte a1 = s1.nextByte();
        System.out.println(a1);
        short a2=s1.nextShort();
        System.out.println(a2);
        int a3= s1.nextInt();
        System.out.println(a3);
        long a4= s1.nextLong();
        System.out.println(a4);
        String a5= s1.next();
        System.out.println(a5);
        float a6= s1.nextFloat();
        System.out.println(a6);
        double a7= s1.nextDouble();
        System.out.println(a7);
        boolean a8= s1.nextBoolean();
        System.out.println(a8);
        s1.close();
	}
	 

}
