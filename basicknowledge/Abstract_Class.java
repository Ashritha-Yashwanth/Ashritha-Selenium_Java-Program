package basicknowledge;
abstract class Amazon_Auth
{//not possible abstraction 100%
	//hiding 100%
	abstract void un();//abstract method
	abstract void un_mob();//abstract method
	void login_button()//concrete methods
	{
		System.out.println("Logic");
		
	}
}
abstract class Amazon_Login extends Amazon_Auth
{
	abstract void un_as_email();
	abstract void un_as_mobile();
	void registration_button()//concrete method
	{
		System.out.println("Logic 1");	
	}
}
public class Abstract_Class extends Amazon_Login
{
    static void loginwith_mob()
    {
    	System.out.println("Logic 2");	
    }
	public static void main(String[] args) 
	{
		Abstract_Class a1=new Abstract_Class();
		a1.login_button();
		a1.un_as_email();
		a1.un_as_mobile();
		a1.un_mob();
		a1.un();
		a1.registration_button();
		loginwith_mob();
	}
	@Override
	void un_as_email() {
		System.out.println("This is the abstract method1");
		
	}
	@Override
	void un_as_mobile() {
		System.out.println("This is the abstract method2");
		
	}
	@Override
	void un() {
		System.out.println("This is the abstract method3");
		
	}
	@Override
	void un_mob() {
		System.out.println("This is the abstract method4");
		
	}
	

}
