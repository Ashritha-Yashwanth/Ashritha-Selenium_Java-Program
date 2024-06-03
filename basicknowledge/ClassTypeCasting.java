package basicknowledge;
class ParentClass
{
	static void add()
	{
		System.out.println("1");
	}
}
public class ClassTypeCasting extends ParentClass
{

	public static void main(String[] args) 
	{
		ParentClass p1 = new ClassTypeCasting();
		//upcasting ->implicit way
		p1.add();
		ParentClass p2 =(ParentClass) new ClassTypeCasting();
		//upcasting ->explicit way		

	}

}
