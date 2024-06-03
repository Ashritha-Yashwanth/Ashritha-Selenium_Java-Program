package basicknowledge;

import java.util.Date;

public class ToGetTheFutureDate 
{

	public static void main(String[] args)
	{
		Date d1=new Date();
		System.out.println(d1.getTime()); //gives the epoch time
		Date d2= new Date(d1.getTime()+(60*60*1000*24*1));//new object creation ,another way to convert the epoch time to human understandable time
		System.out.println(d2);

	}

}
