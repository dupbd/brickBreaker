package brickBreaker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		//TODO ball direction off paddle is set. Needs
		//to change based on left side/right side.
		//Comes off same way regardless. Makes game
		//play in exact same pattern every time.
		
		
		// JFrame - border
		JFrame obj = new JFrame();
		Gameplay gamePlay = new Gameplay();
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Brick Breaker");
		obj.setResizable(false);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
		obj.setVisible(true);
		
	}

}
