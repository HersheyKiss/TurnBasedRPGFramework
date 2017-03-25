package inventory;

public class Item {
	private String name;
	private int weight;
	private int[] attack;//3 index array [cutting, crushing, piercing] offensive ratings
	private int[] defense;// same as above, but for defensive rating
	
	public Item(){
	}
	
	public Item(String name, int weight, int[] attack, int[] defense){
		this.name = name;
		this.weight = weight;
		this.attack = attack;
		this.defense = defense;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getWeight(){
		return this.weight;
	}
	
	public int[] getAttack(){
		return this.attack;
	}
	
	public int[] getDefense(){
		return this.defense;
	}
	
}
