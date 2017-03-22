package theMain;

import graphics.MainMenu;

import javax.swing.JFrame;

/**
 * The object that is the lowest point in the program (the very start)
 * @author Robert
 *
 */
public class Game {
	public JFrame frame = new JFrame();
	
	public Game(){
		//TODO: set the look and feel of the program
		frame.setUndecorated(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new MainMenu());
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
}
