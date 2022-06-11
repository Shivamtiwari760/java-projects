package differ_projects;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitClass {
	@Test
	public void setup() {
		String str = "this is my first junit program";
		assertEquals("this is my first junit program",str);
	}

}
