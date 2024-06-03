package basicknowledge;

public class AssertProgramInJava
{

	public static void main(String[] args)
	{
		String name ="";
		assert name.length()>0:"The length is 0 or less";//checking that names has something init.it should not be empty
		
		System.out.println(name.concat(" Naavik"));

	}

}
