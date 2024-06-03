package basicknowledge;

public class StringFunction
{

	public static void main(String[] args)
	{
	    String name="School";
	    System.out.println(name.length());
	    /*int length_of_the_string = name.length();
	    System.out.println(length_of_the_string);*/
	    System.out.println(name.charAt(2));
	    System.out.println(name.indexOf('h'));
	    System.out.println(name.toUpperCase());//convert the given string into capital letters
	    System.out.println(name.toLowerCase());
	    System.out.println(name.concat(" name is abc public school"));//combining the string
	    String first_name="sushravya";
	    String last_name="Yashwanth";
	    System.out.println(first_name.concat(" ").concat(last_name));//FN,SPACE,LN is string
	    System.out.println(name.contains("Sch"));//true
	    System.out.println(name.contains("sch"));//false case sensitive
	    String title_of_page=" we are here for you online needs";
	   // System.out.println(title_of_page);
	    System.out.println(title_of_page.trim());

	}

}
