package basicknowledge;

public class AddSubMulDivMod {
	static void add()
	{
		int a=100;
		int b=200;
		int sum=a+b;
		System.out.println(sum);
	}
	static void sub()
	{
		int a=100;
		int b=200;
		int sum=a-b;
		System.out.println(sum);
	}
	static void mul()
	{
		int a=100;
		int b=200;
		int sum=a*b;
		System.out.println(sum);
	}
	static void div()
	{
		int a=400;
		int b=200;
		int sum=a/b;
		System.out.println(sum);
	}
	static void mod()
	{
		int a=4;
		int b=2;
		int sum=a%b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		mod();
	}

}
