package graphics.sprites;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {
	public static Sprite nullSprite = new Sprite("res/nullSprite.png");//a sprite to default to so that there is actually a sprite to use in case the intended sprite fails to load or is otherwise null
	
	private BufferedImage image;
	
	public Sprite(String locationURL){
		try{
			this.image = ImageIO.read(new File(locationURL));
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public Sprite(BufferedImage image){		
		this.image = image;
	}
	
	/**
	 * 
	 * @return the BufferedImage that is contained in this sprite
	 */
	public BufferedImage getImage(){
		return this.image;
	}
	
	//TODO: Create SpriteSheet class
	//TODO: Implement Sprite(Spritesheet, x, y) as valid constructor
	
	
}
