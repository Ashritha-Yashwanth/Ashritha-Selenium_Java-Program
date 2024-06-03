package basicknowledge;

import java.util.Arrays;

public class SplitString
{

	public static void main(String[] args)
	{
		String a1 = "My name is Ashritha";
		String arr[]=a1.split(" ");
		System.out.println(Arrays.toString(arr));
	}
}