package basicknowledge;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEquals_Method 
{

	public static void main(String[] args)
	{
		 System.out.println("Starting of first array");
		Scanner s1= new Scanner(System.in);	
	     int rollno[]=new int[3];
	     for(int i=0;i<3;i++) 
	     {
	    	  System.out.println("Enter the Array :" + i);
	    	  rollno[i] = s1.nextInt();
	     }	  
	     System.out.println("Starting of second array");
	    	  int rollno1[]=new int[3];
	 	     for(int i=0;i<3;i++) 
	 	     {
	 	    	  System.out.println("Enter the Array :" + i);
	 	    	  rollno1[i] = s1.nextInt();
	 	     }
	 	    System.out.println(Arrays.toString(rollno));
	 	   System.out.println(Arrays.toString(rollno1));
	 	 if(  Arrays.equals(rollno, rollno1)== true)
	 	 {
	 		 System.out.println("hey u did magic 2 arrays are exactly same");
	 	 }
	 	 else
	 	 {
	 		 System.out.println("Sorry,two arrays are different");
	 	 }
	}
	

}
