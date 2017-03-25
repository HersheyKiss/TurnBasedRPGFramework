package world;

import entity.Entity;
import entity.PlayerCharacter;
import graphics.sprites.Sprite;

import java.util.ArrayList;

public class Tile{
	
	private Sprite sprite;//this is the sprite of the tile. Other things placed on the tile will have their own sprites, and will render according to their order in the ArrayList (or by a yet-to-be-implemented layering system)
	private ArrayList<Entity> occupants;//this includes things such as entities (player-characters, projectiles, chairs, tables, chests, etc. Anything that isn't the floor. Or is also the floor (such as a dirt area for planting things, and the plants that are located there))
	private boolean solid;//this determines if this tile can be passed through or not. Additional mobility attributes are wanted, but little thought has been given to them.
	
	public Tile(){
	}
	
	public Tile(Sprite sprite){
		this.sprite = sprite;
		this.solid = false;
	}
	
	public Tile(Sprite sprite, ArrayList<Entity> occupants, boolean solid){
		this.sprite = sprite;
		this.occupants = occupants;
		this.solid = solid;
	}
	
	public void setSprite(Sprite sprite){
		this.sprite = sprite;
		this.occupants = new ArrayList<Entity>();
		this.solid = false;
	}
	
	public Sprite getSprite(){
		if(this.sprite == null){//if the sprite doesn't exist for any reason, return the default 'nullSprite' 
			return Sprite.nullSprite;
		}
		return this.sprite;
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
	
	public boolean isSolid(){
		return solid;
	}
	
	public void setSolid(boolean solid){
		this.solid = solid;
	}
	
	public static Tile nullTile = new Tile(Sprite.nullSprite);
	
}
