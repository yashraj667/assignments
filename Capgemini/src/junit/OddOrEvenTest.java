package junit;

import org.junit.Test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

//import junit.framework.Assert;

public class OddOrEvenTest {
	OddOrEven obj;
	@Test
	public void testForOdd() {
		System.out.println("odd************");
		int testData=11;
		String expectedResult="Odd";
		//OddOrEven obj=new OddOrEven();
	String actualResult=obj.oddOrEven(testData);
	Assert.assertEquals(expectedResult, actualResult);
	
	
	}

		@Test
		public void testForEven() {
			
			int testData=11;
			String expectedResult="Even";
			//OddOrEven obj=new OddOrEven();
		String actualResult=obj.oddOrEven(testData);
		Assert.assertEquals(expectedResult, actualResult);
		System.out.println("even************");
		
		}
		
		@Test(expected=RuntimeException.class)
			public void testForException() {
			System.out.println("exception************");
			int testData=0;
			OddOrEven obj=new OddOrEven();
			obj.oddOrEven(testData);
			
			
			}
		
		@Before
		public void  setUp() {
			obj=new OddOrEven();
			System.out.println("Before*********");
		}
		@After
		public void teardown() {
			obj=null;
			System.out.println("After*********");
		}
}
