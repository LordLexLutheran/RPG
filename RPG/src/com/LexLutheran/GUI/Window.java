package com.LexLutheran.GUI;

import javax.swing.*;

public class Window {
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	
	static String title;
	static int sizeX;
	static int sizeY;
	
	
	public Window(String title){
		frame = new JFrame(title);
		Window.title = title;
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		label = new JLabel("Hello World");
		
		panel.add(label);
		frame.add(panel);
		
		frame.setVisible(true);
	}
	
	public Window(String title, int sizeX, int sizeY){
		frame = new JFrame(title);
		Window.title = title;
		frame.setSize(sizeX, sizeY);
		Window.sizeX = sizeX;
		Window.sizeY = sizeY;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		label = new JLabel("Hello World");
		
		panel.add(label);
		frame.add(panel);
		
		frame.setVisible(true);
	}
	
}