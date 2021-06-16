package shah.mokito3;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import shah.stub2.TodoBusinessImpl2;
import shah.stub2.TodoService1;

/*
Mokcing?

Create obj that simulate behaviour of real obj.
unlike stubs, mock can dynamically created from code at runtime.
offers more functionality than stubbing.
verify method calls and a lot other things.

The Mockito.mock() method allows us to create a mock object of a class or an interface. Then, we can use the mock to stub return values for its methods and verify if they were called.

last lessson we do alot of setup for stub but here we can achieve the same within 1 file.
*/
public class TodoBusinessImplMokitoTest1 {

	@Test
	public void usingMockito() {

		TodoService1 todoService = mock(TodoService1.class);
		List<String> allTodos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		when(todoService.retrieveTodos("Dummy")).thenReturn(allTodos);

		TodoBusinessImpl2 todoBusinessImpl = new TodoBusinessImpl2(todoService);
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, todos.size());
	}

	@Test
	public void returnEmpty() {

		TodoService1 todoService = mock(TodoService1.class);
		List<String> allTodos = Arrays.asList();
		when(todoService.retrieveTodos("Dummy")).thenReturn(allTodos);

		TodoBusinessImpl2 todoBusinessImpl = new TodoBusinessImpl2(todoService);
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(0, todos.size());
	}
}
