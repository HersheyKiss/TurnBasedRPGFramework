package io.fileFilters;

import java.io.File;
import java.io.FileFilter;

public class CharacterFileFilter implements FileFilter{
	
	public CharacterFileFilter(File file){
		
	}
	
	public boolean accept(File pathname) {
		if(pathname.getName().contains("PlayerCharacter")){
			return true;
		}else{
			return false;
		}
	}
	
}
