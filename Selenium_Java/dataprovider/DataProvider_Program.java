package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Program
{
	@DataProvider(name ="data1")
	public Object method1()
	{
		return new Object[] [] {{"ram"},{"laxman"},{"shivu"},{"vishnu"},{"ash"},{"aadvik"},{"naavik"}};
	}
	@DataProvider(name ="data2")
	public Object method2()
	{
		return new Object[] [] {{11},{22},{45},{69},{013},{27},{98}};
	}
/*  @Test(dataProvider="data1")
  public void testcase1(String name)
  {
	  System.out.println(name.concat("tiwari"));
  }*/
  @Test(dataProvider="data2")
  public void testcase2(int rollno)
  {
	  System.out.println(rollno+100);
  }
}
