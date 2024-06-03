package basicknowledge;

public class FinalVariable
{
   final double pi= 3.142;
   int radius = 20;
   double areaofcircle = pi*radius*radius;
   public static void main(String[] args)
   {
	   FinalVariable f1= new  FinalVariable();
	   System.out.println("Area of circle " + f1.areaofcircle);	
	}

}
