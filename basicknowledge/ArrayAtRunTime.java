package basicknowledge;

import java.util.Scanner;

public class ArrayAtRunTime 
{

	public static void main(String[] args)
	{
	 Scanner s1= new Scanner(System.in);	
     int rollno[]=new int[3];
     for(int i=0;i<3;i++) 
     {
    	  System.out.println("Enter the Array :" + i);
    	  rollno[i] = s1.nextInt();//the first nextInt value comes have to store it on rollno[0] 
    	  System.out.println(rollno[i]);
    	 // s1.close();
     }
   
	}

}
