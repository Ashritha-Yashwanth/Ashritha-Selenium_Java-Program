package basicknowledge;

import java.util.Arrays;

public class CopyOfArray 
{
	public static void main(String[] args) 
	{
		String name[]=new String[4];//string 1
		name[0]="Ram";
		name[1]="Sita";
		name[2]="Laxman";
		name[3]="Deepika";
		String namecopy[]=new String[name.length];//string 2
		
		for(int i=0;i<name.length;i++)
		{
		  namecopy[i]		=name[i];
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(namecopy));

		
		
	}

}
