package io.PlayercharacterIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @deprecated This class was never finished. Use PCIO instead
 * @author Robert
 *
 */
public class PlayercharacterWriter {
	private static BufferedWriter writer;
	
	public static void main(String[] args){
		File file = new File("characters/PlayerCharacter - Test A.txt");
		try {
			writeTag(file, "name", "buttkiss");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeTag(File targetFile, String targetTag, String value) throws IOException{
		int offset = 0;//the offset of the target tag in the 
		FileReader fReader = new FileReader(targetFile);
		BufferedReader reader = new BufferedReader(fReader);
		//find the tag
		String line = null;
		while(true){
			line = reader.readLine();
			if(line == null) break;
		}
		
		
		reader.close();
		fReader.close();
	}
	
}
