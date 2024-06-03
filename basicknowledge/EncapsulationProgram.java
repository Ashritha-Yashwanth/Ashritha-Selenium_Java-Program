package basicknowledge;
class Amazon_Application
{
	private String un="ashritha@gmail.com";//updated to abc@gmail.com
	
	public String getun()
	{
		return un;
	}
	public void setun(String un)
	{
		this.un=un;//updated LV to GV
	}
}
public class EncapsulationProgram 
{

	public static void main(String[] args)
	{
		Amazon_Application a1=new Amazon_Application();
		a1.setun("abc@gmail.com");//updated the value and setting up
		System.out.println(a1.getun());//getting the value
		

	}

}
