package com.piotrgalganski84;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import javax.swing.SwingUtilities;

public class View {
	
	Controller controller;
	ViewFrame viewFrame;
	
	
	public void displayView() {
		
		try {
			SwingUtilities.invokeAndWait(()-> {
				viewFrame = new ViewFrame(this);
				viewFrame.setVisible(true);
			});
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public List<String> getData() {
		return controller.getData();
	}
	
	public void setController (Controller c) {
		this.controller = c;
	}

}
