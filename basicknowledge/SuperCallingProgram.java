package basicknowledge;

class Odd_Num
{
	Odd_Num()
	{
	System.out.println("Grand Parent");
}
}
	class Even_Num extends Odd_Num
	{
		Even_Num()
		{
			super();
			System.out.println("Parent");
		}
	}
public class SuperCallingProgram extends Even_Num
{
	SuperCallingProgram()
	{
		super();
		System.out.println("Child");
	}
	public static void main(String[] args)
	{
    new SuperCallingProgram();
	}
}
