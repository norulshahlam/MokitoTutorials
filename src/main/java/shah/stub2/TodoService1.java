package shah.stub2;

import java.util.List;

// External Service - Lets say this comes from WunderList
public interface TodoService1 {

	public List<String> retrieveTodos(String user);

	void deleteTodo(String todo);

}