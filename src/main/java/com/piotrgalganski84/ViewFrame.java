package com.piotrgalganski84;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ViewFrame extends JFrame {
	
	private static final Dimension BUTTON_SIZE = new Dimension(100,50);

	ViewFrame(View view) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setLocationRelativeTo(null);
		
		DefaultListModel<String> jlistModel 
			= new DefaultListModel<String>();
		jlistModel.addAll(view.getData());
		JList<String> list = new JList<>(jlistModel);
		
		var centralPanel = createCentralPanel(list);
		var buttonsPanel = createButtonsPanel();
		var mainPanel = createMainPanel(centralPanel, buttonsPanel);
			
		add(mainPanel);
		pack();
		
	}

	private JPanel createCentralPanel(JComponent list) {
		var centralPanel = new JPanel();
		centralPanel.setBackground(Color.BLUE);
		centralPanel.add(new JScrollPane(list), BorderLayout.CENTER);
		
		return centralPanel;
	}

	private JPanel createButtonsPanel() {
		JPanel createdPanel = new JPanel();
		createdPanel.setBackground(Color.RED);
		
		createdPanel.setLayout(new BoxLayout(createdPanel, BoxLayout.Y_AXIS));
		
		
		JButton newButton = createNewButton("New task", BUTTON_SIZE);
		JButton divideButton = createNewButton("Divide task", BUTTON_SIZE);
		JButton deleteButton = createNewButton("Delete task", BUTTON_SIZE);
		JButton quitButton = createNewButton("Quit", BUTTON_SIZE);
		
		createdPanel.add(newButton);
		createdPanel.add(divideButton);
		createdPanel.add(deleteButton);
		createdPanel.add(quitButton);
		
		return createdPanel;
	}
	
	private JButton createNewButton(String label, Dimension buttonSize) {
		var createdButton = new JButton(label);
		createdButton.setPreferredSize(buttonSize);
		createdButton.setMinimumSize(buttonSize);
		createdButton.setMaximumSize(buttonSize);
		return createdButton;
	}

	private JPanel createMainPanel(JComponent ... component) {
		var centralPanel = component[0];
		var buttonsPanel = component[1];
		
		var mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.setBackground(Color.GREEN);
		
		mainPanel.add(centralPanel, BorderLayout.CENTER);
		mainPanel.add(buttonsPanel, BorderLayout.WEST);

		return mainPanel;
	}

	
}
