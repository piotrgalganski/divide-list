package com.piotrgalganski84;

public class Task {
	
	String title;
	
	public Task(String n) {
		this.title = n;
	}

	@Override
	public String toString() {
		return this.title;
	}
		
}
