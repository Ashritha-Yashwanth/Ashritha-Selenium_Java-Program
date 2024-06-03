package basicknowledge;
interface interface2
{
	void login();//abstract method
	void logout();//abstract method
}
interface interface1 extends interface2
{
	void search();//abstract method
	void payment();//abstract method
}
public class InterfaceProgram1 implements interface1
{
     void order_page()//concrete method
     {
    	 System.out.println("it is concrete non static method");
     }
     static void address_page()//concrete method
     {
    	 System.out.println("it is concrete static method");
     }
	public static void main(String[] args)
	{
		InterfaceProgram1 i1=new InterfaceProgram1();
		i1.login();
		i1.logout();
		i1.payment();
		i1.search();
		i1.order_page();
		address_page();

	}
	@Override
	public void login() 
	{
	System.out.println("it is the overridden login abstract method ");		
	}
	@Override
	public void logout()
	{
		System.out.println("it is the overridden logout abstract method ");	
	}
	@Override
	public void search() 
	{
		System.out.println("it is the overridden search abstract method ");	
	}
	@Override
	public void payment() {
		System.out.println("it is the overridden payment abstract method ");	
	}

}
