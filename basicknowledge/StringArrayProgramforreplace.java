package basicknowledge;

public class StringArrayProgramforreplace 
{

	public static void main(String[] args) 
	{
		String input = "school123";
		
		String output = input.replace('o', ' ');
		System.out.println(output);
		
		String output1 = input.replace('o', 'm');
		System.out.println(output1);
		
		String output2 = input.replaceAll("[a-z]","");
		System.out.println(output2);
		
		String ip = "School123";
		String output3 = ip.replaceAll("[A-Z]","");
		System.out.println(output3);
		
		String output4 = ip.replaceAll("[0-9]","");
		System.out.println(output4);
		
		
		
	}

}
