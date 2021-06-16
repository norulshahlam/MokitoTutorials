package shah.junit1.helper1;

/**

introduction

how to use unit tests

1. make sure method is void, no return
2. make sure the method name has meaning to the name of the method u 1 2 test
	- public void OnlyOddValues(){}, public void OnlySmallCaps(){}
3. always have 1 method for 1 test so junit can show which test is coming from which method
4. we will learn diff type of assert methods:
	- assertEquals
			Asserts that two objects are equal.
	- assertFalse(boolean condition)
			Asserts that a condition is false.
	- assertTrue(boolean condition)
			Asserts that a condition is true.


 */
import static org.junit.Assert.*;

import org.junit.Test;

import shah.junit1.helper1.StringHelper1;

public class StringHelperTest1 {
	StringHelper1 helper = new StringHelper1();

	@Test
	public void truncateAInFirst2Positions1() {
		// how to use assert - basic
		assertEquals("hi", "hi");
	}

	// 1, 2, 3
	@Test
	public void truncateAInFirst2Positions2() {

		String actual = helper.truncateAInFirst2Positions("AACD");
		String expected = "CD";
		// AACD => CD ACD => CD CDEF=>CDEF CDAA => CDAA
		// how to use assert with variables
		assertEquals(expected, actual);
	}

	// ABCD => false, ABAB => true, AB => true, A => false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

}
