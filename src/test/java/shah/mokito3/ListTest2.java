package shah.mokito3;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.List;
import org.junit.Test;
import org.mockito.Mockito;

/*
simple example of mockito test case
*/

public class ListTest2 {

	@Test
	public void letsMockListSize() {
		List list = mock(List.class);
		// we define what is the expected ie 10
		when(list.size()).thenReturn(10);
		assertEquals(10, list.size());
	}

	@Test
	public void letsMockListSizeWithMultipleReturnValues() {
		List list = mock(List.class);
		// multiple orders of expected. 1st - 10, then 20
		when(list.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, list.size()); // First Call
		assertEquals(20, list.size()); // Second Call
	}

	@Test
	public void letsMockListGet() {
		List<String> list = mock(List.class);
		when(list.get(0)).thenReturn("in28Minutes");
		assertEquals("in28Minutes", list.get(0));
		// easy mock - when test case uses method not defined in when(), it always
		// returns null
		assertNull(list.get(1));
	}

	@Test(expected = RuntimeException.class)
	public void letsMockListGetToThrowException() {
		List<String> list = mock(List.class);
		when(list.get(Mockito.anyInt())).thenThrow(new RuntimeException("Something went wrong"));
		list.get(0);
	}

	@Test
	public void letsMockListGetWithAny() {
		List<String> list = mock(List.class);
		// argument matchers - using variable instead of fixed val like above - so now
		// any int is considered defined test case
		Mockito.when(list.get(Mockito.anyInt())).thenReturn("in28Minutes");
		// If you are using argument matchers, all arguments
		// have to be provided by matchers.
		assertEquals("in28Minutes", list.get(0));
		assertEquals("in28Minutes", list.get(1));
	}

	@Test
	public void bddAliases_UsingGivenWillReturn() {
		List<String> list = mock(List.class);

		// given
		given(list.get(Mockito.anyInt())).willReturn("in28Minutes");

		// then
		assertThat("in28Minutes", is(list.get(0)));
		assertThat("in28Minutes", is(list.get(0)));
	}
}
