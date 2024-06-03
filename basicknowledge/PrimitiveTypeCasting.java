package basicknowledge;

public class PrimitiveTypeCasting //primitive widening ex
{

	public static void main(String[] args)
	{
		double a = 90;   //implicitly
		System.out.println(a);
		
		int age=90;
		double ageofperson = age; //implicitly
		System.out.println(ageofperson);
		
		double ageofperson1 = (double)age;//explicitly
		System.out.println(ageofperson1);

		//-----------------
		
		double pi=3.14;   //narrowing explicitly
		int pinewvalue = (int)pi;
		System.out.println(pinewvalue);
		
		byte age1= 82;
		long ageofperson11 = age1; //conversion from byte to long is possible 
		System.out.println(ageofperson11);
		age1=  1000; 
		System.out.println(age1);// but updating value as 1000 is not possible
		
		long salary = 1000;
	    byte salofperson = salary;
		System.out.println(salary);
		
		int age2 = 25;
		float ageofperson2 = age2;
		System.out.println(age2);
		
	}

}
