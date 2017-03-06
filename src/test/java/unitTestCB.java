import junit.framework.Assert;
import org.junit.Test;

public class unitTestCB {

	@Test
	public void testPrintcbTest() {

		Assert.assertEquals(App.getHelloWorld(), "Hello, World Continuous buid");

	}

}


import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class unitTestCB {
   @Test
   public void testAdd() {
      String str= "Junit is working fine";
      assertEquals("Junit is working fine",str);
   }
}