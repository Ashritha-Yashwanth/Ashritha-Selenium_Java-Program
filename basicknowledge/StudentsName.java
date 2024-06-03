package basicknowledge;

public class StudentsName
{

	public static void main(String[] args)
	{
		String names[]=new String[3];//3 is size of the students names
		//declare and initialise your array
		names[0]= "Aadvik";//values to assign
		names[1]= "Sushravya";
		names[2]= "Naavik";
		names[2]= "Naavik SN";//updation prints the latest value
		/*for(int i=0;i<=2;i++)
		{
		System.out.println(names[i]);
		
		}*/ 
		int rollno[]= new int[3];
		rollno[0]= 12;                                                         
		rollno[1]= 45;
		rollno[2]= 25;
		
		char gender[]= new char[3];
		gender[0]= 'M';
		gender[1]= 'F';
		gender[2]= 'M';
		System.out.println("Student names"+"  " +"RollNo" + "  "+"Gender");
		for(int i=0;i<=2;i++)
		{
			
		System.out.println(names[i] + "      " +    rollno[i]+ "     "+   gender[i]);
		
		}
	}

}
