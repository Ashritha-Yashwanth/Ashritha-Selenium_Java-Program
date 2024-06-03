package basicknowledge;

public class World {
      World()//non parameterised constructor
      {
    	  System.out.println("1");
      }
      World(double a)//parameterised constructor
      {
    	  System.out.println("2");
      }
      World(int  a)//parameterised constructor
      {
    	  System.out.println("3");
      }
      World(String a)//parameterised constructor
      {
    	  System.out.println("4");
      }
      World(int a,double b)//parameterised constructor
      {
    	  System.out.println("5");
      }
      World(int a,int b,int c,int d,int e,int f,int g)
      {
    	  System.out.println("6");
      }
      World(int a,boolean b,String c,double d,char e,float f,long g)
      {
    	  System.out.println("7");
      }
	public static void main(String[] args) {
		World w1= new World();//non parameterised object creation
		World w2= new World(3.14);//parameterised object creation
		World w3= new World(100);
		World w4= new World("A");
		World w5= new World(100,90.76);
		World w6= new World(128,-200,2356,-8765,89788,235566,877);
		World w7= new World(128,true,"A",87.67,'A',12.89f,253253226);

	}

}
