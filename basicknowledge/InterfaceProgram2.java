package basicknowledge;
interface Youtube
{
	void watch_later();
	void play();
}
interface Gmail
{
	void schedule();
	void inbox();
}
public class InterfaceProgram2 implements Gmail,Youtube
{

	public static void main(String[] args) 
	{
		InterfaceProgram2 i1= new InterfaceProgram2();
        i1.watch_later();
        i1.play();
        i1.schedule();
        i1.inbox();
	}

	@Override 
	public void watch_later() 
	{
		System.out.println("it is the overriden watch later abstract method");
		
	}

	@Override
	public void play()
	{
		System.out.println("it is the overriden play abstract method");
	}

	@Override
	public void schedule()
	{
		System.out.println("it is the overriden schedule abstract method");
		
	}

	@Override
	public void inbox()
	{
		System.out.println("it is the overriden inbox abstract method");
		
	}

}
