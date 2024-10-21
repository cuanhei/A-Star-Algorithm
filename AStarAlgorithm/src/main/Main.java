package main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		//Create window for Graphic Interface [See how it works]

		JFrame window = new JFrame();
		DemoPanel dp = new DemoPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.add(dp);
		window.pack();
		window.setVisible(true);
		
		System.out.println("[A* Algorithm] - find the closest path.\n");
		System.out.println("[+] Please select the starting point");
		
	}

}
