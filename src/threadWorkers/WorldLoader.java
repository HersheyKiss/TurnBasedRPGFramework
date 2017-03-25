package threadWorkers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import world.World;

public class WorldLoader extends Thread{
	
	World loadedWorld;
	BufferedImage worldAlias;//the image that represents the map is written to disk rather than serialized copies of the entire thing. Load that image and regenerate the map.
	File targetURL;
	
	public WorldLoader(File file){
		this.targetURL = file;
		
		
		loadAlias();
		
	}
	
	private void loadAlias(){
		try{
			worldAlias = ImageIO.read(targetURL);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
