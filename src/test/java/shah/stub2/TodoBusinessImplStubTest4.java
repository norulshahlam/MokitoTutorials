package shah.stub2;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;

/*
A stub is a fake class that comes with preprogrammed return values. It's injected into the class under test to give you absolute control over what's being tested as input. A typical stub is a database connection that allows you to mimic any scenario without having a real database.
*/
public class TodoBusinessImplStubTest4 {

	@Test
	public void usingAStub() {
		TodoService1 todoService = new TodoServiceStub3();
		TodoBusinessImpl2 todoBusinessImpl = new TodoBusinessImpl2(todoService);
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("Ranga");
		assertEquals(2, todos.size());
	}
}
