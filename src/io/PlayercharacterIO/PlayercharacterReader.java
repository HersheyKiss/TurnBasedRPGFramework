package io.PlayercharacterIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import entity.PlayerCharacter;
/**
 * @deprecated -- this class was never finished. Use PCIO instead.
 * @author Robert
 *
 */
public class PlayercharacterReader {
	
	private BufferedReader reader;
	
	public PlayercharacterReader(File targetFile) throws FileNotFoundException{
		reader = new BufferedReader(new FileReader(targetFile));
	}
	
	public PlayerCharacter readCharacter(){
		PlayerCharacter character = new PlayerCharacter();//the PlayerCharacter instance that will store the info that was loaded
		String[] stats = new String[6];//array of Strings to store character info
		//read in the playercharacter stats
		
		
		//TODO: determine process to convert String to int
				for(int i = 0; i < stats.length; i++){
//					this.stats[i] = stats
				}
		return character;
	}
	
}
