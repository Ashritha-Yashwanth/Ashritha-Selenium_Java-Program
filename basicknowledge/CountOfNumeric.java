package basicknowledge;

import java.util.Arrays;

public class CountOfNumeric 
{
	static int countofnumeric=0;
	public static void main(String[] args)
	{
		String name ="Ash890462340";
		char [] c1=name.toCharArray();//string converted to array
        System.out.println(Arrays.toString(c1));//print the char in Array single line
        for(int i=0;i<c1.length;i++)
        {
        	boolean answer= Character.isDigit(c1[i]);
        	if(answer==true)
        	{
        		countofnumeric++;
        	}
        	
	}
        System.out.println("The total count of numbers are-> "+ countofnumeric);
	}

}
