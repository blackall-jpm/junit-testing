package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareUT {

	@Test
	public void test() {
		UnitTestingClass utObj = new UnitTestingClass();
		int output_f = utObj.square(4);
		// Test the output
		assertEquals(16,output_f);
	}

}
