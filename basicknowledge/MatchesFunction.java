package basicknowledge;
public class MatchesFunction
{
	public static void main(String[] args) 
	{
	  String input = "Janish";
	  System.out.println(input.matches("M(.*)"));
	  System.out.println(input.matches("(.*)h"));
	  String ip="Malik";
	  System.out.println(ip.matches("....."));
	  String a1= "School";
	  int a2=a1.lastIndexOf('o');
	  System.out.println(a2);
	  //System.out.println(input.lastIndexOf('h'));
	  String name= "Aman";
	  System.out.println(name.repeat(10));
	  
	}

}
