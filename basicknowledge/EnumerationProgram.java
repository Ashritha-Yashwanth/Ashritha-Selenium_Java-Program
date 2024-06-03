package basicknowledge;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationProgram 
{

	public static void main(String[] args)
	{
		Vector v = new Vector();
		v.add(10);
		v.add("Ash");
		v.add(15.2);
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}

}
