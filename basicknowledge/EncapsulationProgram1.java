package basicknowledge;
class Api_Program
{
      private int age=18;

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}	
}

public class EncapsulationProgram1 
{

	public static void main(String[] args)
	{
		 Api_Program a1=new  Api_Program();
		 a1.setAge(72);
		 System.out.println(a1.getAge());
	}

}
