package basicknowledge;
class Parent_class
{
	void add()
	{
	System.out.println("Addition");	
	}
	void sub()
	{
		System.out.println("Substraction");	
	}
}
public class Child_class extends Parent_class
{
    void mul()
    {
    	System.out.println("Multiplication");	
    }
	public static void main(String[] args) 
	{
		 Child_class c1 = new  Child_class();
		 c1.mul();
		 c1.add();
		 c1.sub();
		 
	}

}
