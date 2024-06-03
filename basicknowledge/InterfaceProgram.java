package basicknowledge;
interface Keyboard
{

	void login();//abstract method
	void logout();//abstract method
}
public class InterfaceProgram implements Keyboard
{

	public static void main(String[] args)
	{
		 InterfaceProgram i1=new  InterfaceProgram();
		 i1.login();
		 i1.logout();

	}

	@Override
	public void login()
	{
		System.out.println("Login with mobile no");
		
	}

	@Override
	public void logout()
	{
		System.out.println("Logout from the mobile no");	
		
	}

}
