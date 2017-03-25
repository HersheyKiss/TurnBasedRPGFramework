package entity;

import java.io.Serializable;

import inventory.Inventory;


public class PlayerCharacter extends Entity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	String name;//the name of this character
	String specialization;//the class of the character (Fighter, rogue, ranger, etc) (specialization because 'class' is a keyword)
	int level;//the level of this character
	int[] stats;//constitution, strength, dexterity, wisdom, intelligence, will-power
	Inventory inventory;//an inventory for the character's items
	
	public PlayerCharacter(){
		super();
	}
	
	/**
	 * Creates a new PlayerCharacter that can be immediately populated with information
	 * @param name The name of the character being created
	 * @param stats The base stats of the character being created
	 * @param inventory An inventory that the character has ('null' is a valid option for characters that cannot carry anything)
	 */
	public PlayerCharacter(String name, int[] stats, Inventory inventory){
		super();
		this.name = name;
		this.stats = stats;
		this.inventory = inventory;
	}
	
	public void setStats(int[] stats){
		this.stats = stats;
	}
	
	public int[] getStats(){
		return this.stats;
	}
	
}
