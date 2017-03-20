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
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.add(new MainMenu());
		frame.pack();
		frame.setVisible(true);
	}
	
}
