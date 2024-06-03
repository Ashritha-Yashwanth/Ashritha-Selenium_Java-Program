package basicknowledge;

public class NonStaticMethodProgram
{
    void add()
    {
    	int a=100;
    	int b=200;
    	System.out.println(a+b);
    }
    void sub()
    {
    	int a=100;
    	int b=200;
    	System.out.println(a-b);
    }

	public static void main(String[] args) {
		NonStaticMethodProgram n1=new NonStaticMethodProgram();//syntax to create an object
        n1.add();
        n1.sub();
	}

}
