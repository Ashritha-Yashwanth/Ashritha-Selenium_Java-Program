package basicknowledge;

public class ThisCalling
{
	ThisCalling()
      {
    	  this(100);
    	  System.out.println("1");
      }
	ThisCalling(int a)
      {
		this(3.14);
    	  System.out.println("2");
      }
	ThisCalling(double a)
      {
    	System.out.println("3");  
      }
	public static void main(String[] args) 
	{
		
		ThisCalling m1=new ThisCalling();//ThisCalling() constructor calls first(print 1) after adding this(100) it move the control tThisCalling(int a) constructor
     //later adding this(3.14) control moves to the ThisCalling(double a)constructor
	}

}
