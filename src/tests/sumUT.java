package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class sumUT {

	@Test
	public void test() {
		UnitTestingClass utObj = new UnitTestingClass();
		int output_f = utObj.sum(4,5);
		// Test the output
		assertEquals(9,output_f);
	}
}


