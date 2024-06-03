package basicknowledge;
 class Swiggy
{
	static void order_food()//concrete method
	{
		System.out.println("It is the concrete class static method");
	}
	void Cancel_order() //concrete method
	{
		System.out.println("It is the concrete class non-static method");
	}
}
abstract class Zomato extends Swiggy
{
	abstract void select_veg();//abstract method
	abstract void select_nonveg();//abstract method
	static void add_items()//concrete method
	{
		System.out.println("It is the abstract class method1");
	}
	void remove_item()
	{
		System.out.println("It is the abstract class method2");
	}
}
public class Abstract_Class1 extends Zomato
{
   static void add()//concrete method
   {
	   System.out.println("It is the concrete class static method1");
   }
   void sub()//concrete method
   {
	   System.out.println("It is the concrete class non-static method1");
   }
	public static void main(String[] args) 
	{
		order_food();
		Abstract_Class1 a1= new Abstract_Class1();
		a1.Cancel_order();
		a1.remove_item();
		a1.select_nonveg();
		a1.select_veg();
		 add_items();
		 add();
		 a1.sub();
		

	}
	@Override
	void select_veg() {
	System.out.println("It is the abstract class method3");
		
	}
	@Override
	void select_nonveg() {
		System.out.println("It is the abstract class method4");
		
	}

}
