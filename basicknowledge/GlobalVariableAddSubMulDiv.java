package basicknowledge;

public class GlobalVariableAddSubMulDiv
{
   static int a=100;
    static int b=200;
    static void add()
    {
    	System.out.println(a+b);
    }
    void sub()
    {
    	System.out.println(a-b);
    }
    static void mul()
    {
    	System.out.println(a*b);
    }
    void div()
    {
    	System.out.println(a/b);
    }
    void mod()
    {
    	System.out.println(a%b);
    }
    public static void main(String[] args)
    {
	 add();
	 GlobalVariableAddSubMulDiv g1=new GlobalVariableAddSubMulDiv();
	 g1.sub();
	 mul();
	 g1.div();
	 g1.mod();
	}

}
