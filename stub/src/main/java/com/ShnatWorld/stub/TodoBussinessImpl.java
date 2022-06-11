package com.ShnatWorld.stub;
import java.util.ArrayList;
import java.util.List;
public class TodoBussinessImpl {
	private TodoService  TodoService;
	TodoBussinessImpl(TodoService ToDoService){
		this.TodoService=ToDoService;
	}
	public List<String> retrieveTodoRelatedToSpring(String user){
		List<String> fiteredTodos=new ArrayList<String>();
		List<String> allTodos = TodoService.retrieveTodos(user);
		for(String todo :allTodos) {
			if(todo.contains("spring")) {
				fiteredTodos.add(todo);
			}
		}
		return fiteredTodos;
	
	}

}
