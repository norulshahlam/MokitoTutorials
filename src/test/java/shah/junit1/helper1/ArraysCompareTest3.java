package shah.junit1.helper1;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

/*

1. assertArrayEquals

The problem with asset equals when I pass in to objects to it is it expects them to the very same object. So it is not doing an equals on it, but it actually checks if they are really the same object because this area is really different from the numbers. It is different, but it has the same values.

So it is a different object in memory, but it has the same values that the asset equals does not check. So if I want to compare the values inside the area, I should use something called a assertArrayEquals


2. test for exception

3. test for performance
	- test if a method finished execution within the specified.

*/

public class ArraysCompareTest3 {

	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = { 12, 3, 4, 1 };
		int[] expected = { 1, 3, 4, 12 };
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}

	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray() {
		int[] numbers = null;
		Arrays.sort(numbers);
	}

	@Test(timeout = 100)
	public void testSort_Performance() {
		int array[] = { 12, 23, 4 };
		for (int i = 1; i <= 1000000; i++) {
			array[0] = i;
			Arrays.sort(array);
		}
	}

}
