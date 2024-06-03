package basicknowledge;

public class StaticAndNonStaticMethodProgram {
      static void add()
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
		StaticAndNonStaticMethodProgram n1=new StaticAndNonStaticMethodProgram();
		n1.sub();
		add();

	}

}
