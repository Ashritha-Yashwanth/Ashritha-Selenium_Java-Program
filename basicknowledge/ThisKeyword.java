package basicknowledge;

public class ThisKeyword
{
    int age;
    String name;
    double salary;
    void student_details(int age,String name,double salary)
    {
    	this.age=age;
    	this.name=name;
    	this.salary=salary;
    }
	public static void main(String[] args)
	{
		ThisKeyword t1= new ThisKeyword();
		t1.student_details(90,"Ram",90.87);
		System.out.println(t1.name);
		System.out.println(t1.salary);
		System.out.println(t1.age);

	}

}
