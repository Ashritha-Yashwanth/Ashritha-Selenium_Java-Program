package basicknowledge;

public class MathClassProgram 
{

	public static void main(String[] args) 
	{
		double pi= Math.PI;
		System.out.println(pi);
		System.out.println(Math.addExact(1001, 53672));
		System.out.println(Math.addExact(233556, 621123456));
		System.out.println(Math.subtractExact(100, 400));
		System.out.println(Math.subtractExact(2344556, 567788));
		System.out.println(Math.multiplyExact(100, 9));
		System.out.println(Math.sqrt(81));
		System.out.println(Math.max(234, 578));
        System.out.println(Math.min(43, 12));
        for(int i=0;i<100;i++)
        {
        System.out.println(Math.random());
	}
	}
}
