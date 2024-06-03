package basicknowledge;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortMethod
{

	public static void main(String[] args)
	{
		 ArrayList a1 = new ArrayList(); 
         a1.add(15);
         a1.add(76);
         a1.add(900);
         a1.add(-120);
         a1.add(65);
         a1.add(23);
         
         System.out.println(a1.get(2));
         System.out.println(a1.set(0, "ram"));//replacing integer with string
        // Collections.sort(a1); //int collection we cam use heterogenous value so commented it
         System.out.println(a1.indexOf(900));
         System.out.println(a1);
         
         ArrayList a2 = new ArrayList(); 
         a2.add("Aadvik");
         a2.add("Naavik");
         a2.add("Sushravya Yashwanth");
         a2.add("Brunda");
         a2.add("Bindu");
         Collections.sort(a2);
         System.out.println(a2);
         

	}

}
