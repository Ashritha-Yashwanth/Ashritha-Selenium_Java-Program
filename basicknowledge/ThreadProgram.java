package basicknowledge;

public class ThreadProgram 
{
	void add() throws InterruptedException 
	{
		Thread.sleep(2000);
	}

	public static void main(String[] args) throws ClassCastException, InterruptedException
	{
      for(int i=1;i<=10;i++)
      {
    	  System.out.println(i);
    	  Thread.sleep(2000);
      }
    	  
	}

}
