package differ_projects;

import static org.junit.Assert.*;

import org.junit.Test;
public class Assert {
	@Test
	public void testAsertions()
	{
		
		String str=new String("shivam");
		String str1= new String("shivam");
		String str2=null;
		String str3="Shivam";
		String str4="Shivam";
		int val=5;
		int val1=6;
		String[] expectedArray= {"one", "two","three"};
		String[] resultArray= {"one", "two","three"};
		assertEquals(str,str1);
		//check for true
		assertTrue(val<val1);
		// check for false
		assertFalse(val>val1);
		//check weather a string is null or not
		assertNotNull(str);
		// check if it null 
		assertNull(str2);
		//check if the refrence of the object is same of not
		assertSame(str3,str4);
		assertNotSame(str,str1);
		assertArrayEquals(expectedArray,resultArray);		
	}



}
