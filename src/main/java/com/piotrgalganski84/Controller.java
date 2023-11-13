package com.piotrgalganski84;

import java.util.List;

public class Controller {
	
	private Model model;
	private View view;
	
	public Controller (Model model, View view) {
		this.model = model;
		this.view = view;
		view.setController(this);
	}

	public void loadData() {
		model.loadData();
	}

	public void displayView() {
		view.displayView();
	}
	
	public List<Task> getData() {
		return model.getData();
	}

}
