package io.PlayercharacterIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * This class handles the reading and writing of the CharacterProperties of the PlayerCharacters
 * @author Robert
 *
 */
public class PCIO {
	
	public static void writeCharacter(File file, CharacterProperties character){
		//attempt to write the file to disk
		try{
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
			output.writeObject(character);
			output.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static CharacterProperties readCharacter(File file){
		//attempt to read the file off the disk
		try{
			ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
			Object loadedObject = input.readObject();
			input.close();//don't forget to close the input reader
			return (CharacterProperties)loadedObject;//attempt to cast the loaded Object to a CharacterStats object, and immediately return it
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return new CharacterProperties();//return a new instance with default values to indicate failure to load
	}
	
}
