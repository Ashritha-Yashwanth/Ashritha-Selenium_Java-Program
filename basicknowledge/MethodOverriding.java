package basicknowledge;
class Method_Parent
{
	void login()
	{
		System.out.println("Login with mobile no");
	}
}
public class MethodOverriding extends Method_Parent
{
    void login()
    {
    	System.out.println("Login with email id");
    	super.login();
    }
	public static void main(String[] args)
	{
		MethodOverriding m1= new MethodOverriding();
		m1.login();
	
	}

}
