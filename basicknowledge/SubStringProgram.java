package basicknowledge;

public class SubStringProgram 
{

	public static void main(String[] args) 
	{
		String name = "Sushravya Yashwanth";
		System.out.println(name.substring(3));
		System.out.println(name.substring(8));
		System.out.println(name.subSequence(0, 8));
	}

}
