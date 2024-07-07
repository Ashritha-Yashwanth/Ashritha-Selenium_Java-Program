package grouping_program_exclude;

import org.testng.annotations.Test;

public class Grouping_Exclude
{
	@Test(groups= {"smoke"})
	public void Testcase1()
	{
	 System.out.println("smoke testing");
	}
@Test(groups= {"system"})
  public void Testcase2()
   {
	 System.out.println("system testing");
   }
@Test(groups= {"component"})
  public void Testcase3()
   {
	System.out.println("component testing");
   }
@Test(groups= {"system"})
  public void Testcase4()
  {
	System.out.println("system testing");
  }
@Test(groups= {"smoke"})
  public void Testcase5()
 {
	System.out.println("smoke testing");
 }
@Test(groups= {"component"})
public void Testcase6()
 {
	System.out.println("component testing");
 }

}

