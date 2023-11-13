package com.piotrgalganski84;

import java.util.ArrayList;
import java.util.List;

public class Model {
	
	List<Task> list;
	
	public Model() {
		list = new ArrayList<>();
	}
	
	public void loadData() {
		list.add(new Task("First task"));
		list.add(new Task("Second task"));
		list.add(new Task("Third task"));
		
	}
	
	public List<Task> getData() {
		return list;
	}

}
