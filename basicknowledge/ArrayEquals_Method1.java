package basicknowledge;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEquals_Method1
{

	public static void main(String[] args)
	{
		 System.out.println("Starting of first array");
			Scanner s1= new Scanner(System.in);	
		     String name[]=new String[3];
		     for(int i=0;i<3;i++) 
		     {
		    	  System.out.println("Enter the Array :" + i);
		    	  name[i] = s1.next();
		     }	  
		     System.out.println("Starting of second array");
		     String name1[]=new String[3];
		 	     for(int i=0;i<3;i++) 
		 	     {
		 	    	  System.out.println("Enter the Array :" + i);
		 	    	  name1[i] = s1.next();
		 	     }
		 	    System.out.println(Arrays.toString(name));
		 	   System.out.println(Arrays.toString(name1));
		 	 if(  Arrays.equals(name, name1)== true)
		 	 {
		 		 System.out.println("hey given Strings are exactly same");
		 	 }
		 	 else
		 	 {
		 		 System.out.println("Sorry,two Strings  are different");
		 	 }
		
		

	}

}
