package basicknowledge;

public class AverageValueOfArray
{
     static double average=0;
     static int sum=0;
     static int reminder =0;
	public static void main(String[] args)
	{
		int number[]= new int[4];
		number[0]=14;
		number[1]=14;
		number[2]=57;
		number[3]=100;
		
		for (int i=0;i<number.length;i++)
		{
			sum= sum+number[i];
			average=sum/number.length;
			reminder=sum%(number.length);
			
		}
		System.out.println("sum is-> "+sum);
		System.out.println("Average is->"+average);
		System.out.println(reminder);
		}

	}


