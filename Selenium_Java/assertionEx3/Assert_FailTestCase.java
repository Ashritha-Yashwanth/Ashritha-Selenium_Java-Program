package assertionEx3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_FailTestCase 
{
@Test
public void testcase1()
{
	//Assert.assertTrue(false);
	//Assert.assertFalse(true);
	//Assert.assertEquals(false, true);
	//Assert.assertEquals(true, false, "sorry but conditions are not matchimg");
	Assert.assertEquals(11,90);
}
}
