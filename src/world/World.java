package world;

import java.util.ArrayList;

import entity.Entity;

public class World {
	
	private Tile[][] tileArray;
	
	public World(int width, int height){
		this.tileArray = new Tile[width][height];
	}
	
	public void setTile(Tile tile, int x, int y){
		this.tileArray[x][y] = tile;
	}
	
	public Tile getTile(int x, int y){
		if(x >= tileArray.length || y >= tileArray[0].length){//hand back a nullTile if the requested tile is not on the world
			return Tile.nullTile;
		}
		if(tileArray[x][y] == null){//if the space exists, but doesn't have a valid tile, return a nullTile
			return Tile.nullTile;
		}
		return tileArray[x][y];
	}
	
	public ArrayList<Entity> getEntities(int x, int y){
		return tileArray[x][y].getEntities();
	}
	
}
