package basicknowledge;

public class Ashritha {
	   Ashritha()//method1
	   {
		   System.out.println("constructor");
	   }
	   void add()//method2
	   {
		   System.out.println("non static");
	   }
	   static void sub()//method3
	   {
		   System.out.println("static");
	   }
	public static void main(String[] args)//method4
	{
		Ashritha a1=new Ashritha();//syntax1
		new Ashritha();//syntax2
		a1.add();
		sub();
		
		
	}

}
