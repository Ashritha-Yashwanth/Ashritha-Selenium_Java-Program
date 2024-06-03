package basicknowledge;

import java.util.ArrayList;

public class Collection_Program 
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
    System.out.println(a1);
    
    a1.remove(0);//remove the object at given index position
    System.out.println(a1);
    a1.remove("12");//removing complete object
    System.out.println(a1);
   // a1.clear();
  //  System.out.println("After clearing the a1->" + a1);
    boolean answer = a1.isEmpty();
    System.out.println(answer);
    
    ArrayList a2= new ArrayList();
    a2.addAll(a1); //adding all the a1 arraylist
    a2.add(1,"ash"); //adding ash at index position 1 in a2 array
    a2.addAll(0, a1); //entire a1 array added at indexing position 0
    System.out.println(a2);
    System.out.println("Before removing-> " + a2);
  //  a2.removeAll(a1); //removing entire collection
   // System.out.println("After removing-> " + a2); 
    
    ArrayList a3= new ArrayList();
    a3 = (ArrayList) a2.clone();
    System.out.println("a3 is made just replica of a2" + a3);
	}

}
