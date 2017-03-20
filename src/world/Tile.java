package world;

import entity.Entity;
import entity.PlayerCharacter;
import graphics.sprites.Sprite;

import java.util.ArrayList;

public class Tile{
	
	private Sprite sprite;
	private ArrayList<Entity> occupants;
	private boolean solid;
	
	public Tile(){
		
	}
	
	public Tile(Sprite sprite, ArrayList<Entity> occupants, boolean solid){
		this.sprite = sprite;
		this.occupants = occupants;
		this.solid = solid;
	}
	
	/**
	 * @param entity The entity to be added to the array
	 * @param index The location of the entity on that array (use -1 to simply add the entity to the end of the list)
	 */
	public void addEntity(Entity entity, int index){
		this.occupants.add(entity);
	}
	
	public Entity getEntity(int index){
		return this.occupants.get(index);
	}
	
	public ArrayList<Entity> getEntities(){
		return this.occupants;
	}
	
}
