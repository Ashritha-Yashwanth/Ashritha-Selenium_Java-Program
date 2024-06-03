package basicknowledge;

import java.util.Arrays;

public class CountOfSpace
{
    static int count_space=0;
	public static void main(String[] args) 
	{
		String name ="Ash 890462340 yash";
        char[] c1=name.toCharArray();//string converted to array
        System.out.println(Arrays.toString(c1));//print the char in Array single line
        for(int i=0;i<c1.length;i++)
        {
        	boolean answer= Character.isSpaceChar(c1[i]);
        	if(answer==true)
        	{
        		count_space++;
        	}
        	
	}
        System.out.println("The total count of space are-> "+ count_space);
	}

	}


