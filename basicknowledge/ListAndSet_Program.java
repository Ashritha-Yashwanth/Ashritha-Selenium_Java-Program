package basicknowledge;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public class ListAndSet_Program {

	public static void main(String[] args)
	{   
		  System.out.println("Lets understand everything about List");
		   List a1 = new ArrayList(); // upcasting arraylist to list
           a1.add("pen");
           a1.add("pencil");
           a1.add("box");
           a1.add("bottle");
           System.out.println(a1);//list follow index
           a1.add("pen");
           System.out.println(a1);// allow duplicate
           a1.add(null);
           a1.add(null);
           System.out.println(a1);
           Iterator i2 = a1.iterator();
           while(i2.hasNext())
           {
        	   System.out.println(i2.next());
           }
		   
		   
		   System.out.println("Lets understand everything about set");
		   Set a2 = new HashSet(); // upcasting hashset to set
		   a2.add("pen");
           a2.add("pencil");
           a2.add("box");
           a2.add("bottle");
           System.out.println(a2);//set don't follow indexing,rather follow hashcode value
           a2.add("pen");
           System.out.println(a2);//not allow duplicate
           a2.add(null);
           a2.add(null);
           System.out.println(a2);
           
           Iterator i3 = a2.iterator();
           while(i3.hasNext())
           {
        	   System.out.println(i3.next());
           }
           
	}

}
