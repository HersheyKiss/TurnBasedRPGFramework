package graphics.graphicalWorld;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import world.Tile;

public class GraphicsTile extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private Tile tile;
	
	/**
	 * The graphical wrapper for the Tile class (this way the underlying game function and the graphical rendering can be separated and modified as individual units)
	 * @param tile The tile being targeted by this wrapper for graphical rendering
	 */
	public GraphicsTile(Tile tile){
		super();
		this.tile = tile;
		//TODO: create all the listeners for the button. Ensure they maintain standard button use, in addition to desired additional tasks
		
		this.addMouseListener(new MouseListener(){
			
			public void mouseClicked(MouseEvent arg0) {
				MouseClicked(arg0);
			}
			
			public void mouseEntered(MouseEvent arg0) {
				MouseEntered(arg0);
			}
			
			public void mouseExited(MouseEvent arg0) {
				MouseExited(arg0);
			}
			
			public void mousePressed(MouseEvent arg0) {
				MousePressed(arg0);
			}
			
			public void mouseReleased(MouseEvent arg0) {
				MouseReleased(arg0);
			}
		});
	}
	
	public void MouseClicked(MouseEvent evt){
	}
	
	public void MouseEntered(MouseEvent evt){
		//draw the tile selector to the screen when the mouse enters
		showSelector(Color.CYAN);
	}
	
	public void MouseExited(MouseEvent evt){
		//clear the selector from the screen by simply calling repaint() to repair the "damage" done to it
		repaint();
	}
	
	public void MousePressed(MouseEvent evt){
		showSelector(Color.ORANGE);
	}
	
	public void MouseReleased(MouseEvent arg0){
		showSelector(Color.CYAN);
	}
	
	public void showSelector(Color color){
		Graphics g = this.getGraphics();
		g.setColor(color);
		g.draw3DRect(0, 0, this.getWidth(), this.getHeight(), true);
		g.fillRect(0, 0, 10, getHeight());
		g.fillRect(0, 0, getWidth(), 10);
		g.fillRect(0, getHeight()-10, getWidth(), 10);
		g.fillRect(getWidth()-10, 0, getWidth(), getHeight());
	}
	
	public void paint(Graphics g){
		super.paint(g);
		//draw the tile sprite for this tile
		int sx1, sy1, sx2, sy2, dx1, dy1, dx2, dy2;
		sx1 = sy1 = sx2 = sy2 = dx1 = dy1 = dx2 = dy2 = 0;
		sx2 = this.tile.getSprite().getImage().getWidth();
		sy2 = this.tile.getSprite().getImage().getHeight();
		dx2 = this.getWidth();
		dy2 = this.getHeight();
		g.drawImage(this.tile.getSprite().getImage(), dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, getParent());
	}
	
	public void repaint(){
		super.repaint();
	}
	
}
