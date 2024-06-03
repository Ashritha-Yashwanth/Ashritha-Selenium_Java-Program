package basicknowledge;

public class ReverseStringUsingStringBuffer 
{
    
	public static void main(String[] args)
	{
		String str = "hello world";
	    String reversed = reverseString(str);
	    System.out.println("original string " + str);
	    System.out.println("reversed string" + reversed);

	}

	private static String reverseString(String str) 
	{
		StringBuffer stringBuffer = new StringBuffer(str);
				stringBuffer.reverse();
				String reversedString = stringBuffer.toString();
				return reversedString;
				
	}
	

}
