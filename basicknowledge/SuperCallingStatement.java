package basicknowledge;
class College
{
	College(String college_name)
	{
		System.out.println("College");
	}
}
class School extends College
{
	School(int a,String b,double c)
	{
		super("SVCE");
		System.out.println("School");
	}
}
public class SuperCallingStatement
{

	public static void main(String[] args) 
	{

       School s1=new School(100,"Ram",67.98);

	}

}



// we want to call the school class so we create the object for particular school class not the pbject creation for child class beacuse we dont have relationship b/w child and school class