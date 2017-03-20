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
		return tileArray[x][y];
	}
	
	public ArrayList<Entity> getEntities(int x, int y){
		return tileArray[x][y].getEntities();
	}
	
}
