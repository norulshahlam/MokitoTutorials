package shah.junit1.helper1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import shah.junit1.helper1.StringHelper1;

/*
in StringHelper1Test.java, there are 2 methods that uses the same helper class, except that the actual n expected are the same. we can prevent this redunddant code repetition by usong parameterized test

below are step in numbers:
*/
@RunWith(Parameterized.class)
public class StringHelperParameterizedTest4 {

	StringHelper1 helper = new StringHelper1();

	// 2
	private String input;
	private String expectedOutput;

	// 3
	public StringHelperParameterizedTest4(String input, String expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	// 1
	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutputs[][] = { { "AACD", "CD" }, { "ACD", "CD" } };
		return Arrays.asList(expectedOutputs);
	}

	// 4
	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}
}
