package basicknowledge;

import java.util.Arrays;

public class ArrayProgram 
{
    static int value;//by creating global variable for count
	public static void main(String[] args) 
	{
		int nos[]=new int[4];
		nos[0]=12;
		nos[1]=41;
		nos[2]=39;
		nos[3]=41;
		int givenno=41;
		for(int i=0;i<nos.length;i++)
		{
			if(givenno==nos[i])
			{
				value++;
				System.out.println("the no is present in given array at the index position " +  i);
			}
			else
			{
				System.out.println("the no is not present in given array at the index position " +  i);
			}	
		}
		System.out.println(value);
	  //  System.out.println(Arrays.toString(nos));

	}

}
