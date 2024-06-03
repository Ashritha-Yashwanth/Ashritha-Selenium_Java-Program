package basicknowledge;

import java.util.Arrays;

public class CountOfAlpha
{
    static int countofalpha=0;
	public static void main(String[] args) 
	{
		String name ="ashritha s";
		char [] c1=name.toCharArray();//string converted to array
        System.out.println(Arrays.toString(c1));//print the char in Array single line
        for(int i=0;i<c1.length;i++)
        {
        	boolean answer= Character.isAlphabetic(c1[i]);
        	if(answer==true)
        	{
        		countofalpha++;
        	}
        	
	}
        System.out.println("The total count of alphabets are-> "+ countofalpha);
}

}