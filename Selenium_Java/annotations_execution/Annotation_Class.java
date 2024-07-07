package annotations_execution;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_Class
{

	@Test
    public static void testcase1()
    {
      System.out.println("testcase1");
    }
	@Test
    public static void testcase2()
    {
      System.out.println("testcase2");
    }
	@BeforeSuite
    public static void bs()
    {
      System.out.println("beforesuite");
    }
	@AfterSuite
    public static void as()
    {
      System.out.println("aftersuite");
    }
	@BeforeTest
    public static void bt()
    {
      System.out.println("beforetest");
    }
	@AfterTest
    public static void at()
    {
      System.out.println("aftertest");
    }
	@BeforeClass
    public static void bc()
    {
      System.out.println("beforeclass");
    }
	@AfterClass
    public static void ac()
    {
      System.out.println("afterclass");
    }
	@BeforeMethod
    public static void bm()
    {
      System.out.println("beforemethod");
    }
	@AfterMethod
    public static void am()
    {
      System.out.println("aftedrmethod");
    }
}
