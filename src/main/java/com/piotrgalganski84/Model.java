package com.piotrgalganski84;

import java.util.ArrayList;
import java.util.List;

public class Model {
	
	List<String> list;
	
	public Model() {
		list = new ArrayList<>();
	}
	
	public void loadData() {
		list.add("First entry");
		list.add("Second entry");
		list.add("Third entry");
	}
	
	public List<String> getData() {
		return list;
	}

}
