package basicknowledge;
class ParentClassOne
{
	
}
public class DownCasting extends ParentClassOne
{

	public static void main(String[] args) 
	{
		ParentClassOne p1 = new DownCasting(); //upcasting
		 
		DownCasting d1 =  (DownCasting) p1; //downcasting
	}

}
