package basicknowledge;

public class MathClassProgram1 
{
  //using mah.random need to get the radius of 10 circle and find area of each circle
	public static void main(String[] args) 
	{
     for(int i=1;i<=10;i++)		
     {
    	 double r=Math.random();
    	 System.out.println("\nMath random no =" + r);
    	 System.out.println("Area of circle is " + (Math.PI*r*r));
    	 
     }

	}

}
