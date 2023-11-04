package com.piotrgalganski84;

public class App {

	public static void main(String[] args) {
		
		
		App app = new App();
		app.start();
	}
	
	public void start() {
		View view = new View();
		Model model = new Model();
		Controller controller = new Controller(model, view);
		
		controller.loadData();
		controller.displayView();
		
	}

}
