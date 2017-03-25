package io.PlayercharacterIO;

import inventory.Item;

import java.io.Serializable;
/**
 * This class is not intended for use during normal game-play, but rather as a way to remove extraneous information when writing PlayerCharacter information to disk - thus decreasing the data footprint
 * @author Robert | robertgarrett404@gmail.com | DerVerrater
 */
public class CharacterProperties implements Serializable{
	//(most of) the following variables were copied directly out of the PlayerCharacter class. Ensure to delete the instance of this class once the PlayerCharacter instance has been properly set up
	String name;//the name of this character
	String specialization;//the class of the character (Fighter, rogue, ranger, etc) (specialization because 'class' is a keyword)
	int level;//the level of this character
	int[] stats;//constitution, strength, dexterity, wisdom, intelligence, will-power
	public Item[] items;//an array of the character's non-equipped items
	public Item[] equippedItems;//an array of the character's equipped items
	//^^^because serializing the Inventory class would defeat the point of this one (to save space by not serializing extraneous data)
	
	private static final long serialVersionUID = 1L;
	
	public CharacterProperties(){
	}
	
}
