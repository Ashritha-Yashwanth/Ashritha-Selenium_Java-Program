package basicknowledge;

public class AssertProgramInJava1 
{
    static void add(int a,int b)
    {
    	assert a==100;
    	int sum= a+b;
    	System.out.println(sum);
    }
	public static void main(String[] args) 
	{
		add(100,200);//matching with assert value 100
		add(121,892);// not matching with 100 so give assertion error

	}

}
