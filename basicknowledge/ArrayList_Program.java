package basicknowledge;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Program 
{

	public static void main(String[] args)
	{
		ArrayList a1= new ArrayList();
	    a1.add("Ram");
	    a1.add("sushravya");
	    a1.add(12);//in array it will not accept,only homogeneous
	    a1.add("67");
	    a1.add(true);
	    a1.add(98);
	    System.out.println(a1.size());
	    System.out.println(a1.contains("sita"));
	    System.out.println(a1);
	    Iterator i1 = a1.iterator();
	    
	    //hasnext
	    while(i1.hasNext())
	    {
	    	System.out.println(i1.next());
	    }

	}

}
