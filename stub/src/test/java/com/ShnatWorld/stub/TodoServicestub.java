package com.ShnatWorld.stub;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TodoServicestub implements TodoService {
	public List<String> retrieveTodos(String user){
		return Arrays.asList("learn spring mvc, learn spring, learn dance");
	}

}
