package basicknowledge;
class Grand_Parent
{
	static void add()
	{
	 System.out.println(1);	
	}
}
class Parent_Class1 extends Grand_Parent
{
	static void sub()
	{
		System.out.println(2);		
	}
}
public class MultiLevelInheritance extends Parent_Class1
{
    static void mul()
    {
    	System.out.println(3);	
    }
	public static void main(String[] args)
	{
	add();
	sub();
	mul();

	}

}
