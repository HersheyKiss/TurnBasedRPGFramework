package inventory;

import java.util.ArrayList;

public class Inventory {
	ArrayList<Item> itemList;//a list to keep track of all the items this character controls (minus the ones that are equipped VVV)
	ArrayList<Item> equippedList;//a list to keep track of all the equipped items (for convenience of calculating armor values, attack values, etc)
	
	public Inventory(){
		itemList = new ArrayList<Item>();
		equippedList = new ArrayList<Item>();
	}
	
	/**
	 * Method is used to ensure that the carry weight of the character that owns this inventory is not exceeded. (use num's <0 to indicate infinite carry capacity)
	 * @param carryWeight the weight (in whatever unit the game uses -- because its flexible. 1 could be pounds, kilo's, ton/tonne', etc, as long as everything is self-consistent)
	 * @return returns a true/false based on whether or not the inventory is under max weight (true), or over (false).
	 */
	public boolean verifyCarryCapacity(int carryWeight){
		int weightOfItems = 0;
		for(int i = 0; i < itemList.size(); i++){
			weightOfItems += itemList.get(i).getWeight();
		}
		if(weightOfItems < carryWeight){//check to see that current item weights are lower than the maximum
			return true;
		}
		//if they're not, then this method will return 'false'
		return false;
	}
	
}
