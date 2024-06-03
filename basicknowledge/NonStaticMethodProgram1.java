package basicknowledge;

public class NonStaticMethodProgram1 {
     void add(){
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
     void mul() 
     {
   	     int a=100;
   		 int b=200;
   		 System.out.println(a*b);
   	 }
     void div() 
     {
   	     int a=100;
   		 int b=200;
   		 System.out.println(a/b);
   	 }
     void mod() 
     {
   	     int a=100;
   		 int b=200;
   		 System.out.println(a%b);
   	 }
	public static void main(String[] args) {
		 NonStaticMethodProgram1 n1= new  NonStaticMethodProgram1();
		 n1.add();
		 n1.sub();
		 n1.mul();
		 n1.div();
		 n1.mod();
	}

}
