package shah.stub2;

import java.util.Arrays;
import java.util.List;

/*
## What You Will Learn during this Step:
- What is a stub?
- Create an unit test using Stub?
- Disadvantages of Stubs
*/

public class TodoServiceStub3 implements TodoService1 {
	public List<String> retrieveTodos(String user) {
		return Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
	}

	public void deleteTodo(String todo) {
	}
}