package basicknowledge;
class StudentClass
{
	StudentClass(int a)
	{
		System.out.println("student Constructor");
	}
}
public class InvokingConstructor
{
	InvokingConstructor()
	{
		System.out.println("Invoking Constructor");
	}
	public static void main(String[] args) 
	{
	new InvokingConstructor();
	new StudentClass(99);
	}
	

}
