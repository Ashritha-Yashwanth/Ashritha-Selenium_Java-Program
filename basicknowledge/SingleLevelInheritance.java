package basicknowledge;
class Parent
{
	static void add()
	{
		System.out.println("Addition");
	}
	
}
public class SingleLevelInheritance  extends  Parent
{
	static void sub()
	{
		System.out.println("subtraction");

	}
	public static void main(String[] args) 
	{
		sub();
		add();
		
	}

}
