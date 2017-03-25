package threadWorkers;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

import javax.swing.Action;
import javax.swing.JList;

public class CharacterListCreator extends Thread implements Action{
	private String[] characterList = new String[0];
	JList<String> listToModify;
	
	/**
	 * 
	 * @param list The list that this thread will update once it's finished processing
	 */
	public CharacterListCreator(JList<String> list){
		listToModify = list;
	}
	
	public void run() {
		File filePath = new File("characters");
		if(!filePath.exists()){//if the folder doesn't exist, create it
			filePath.mkdir();
		}
		//once the file has been properly created, continue normal function (maybe skip past if the folder didn't previously exist)	
		//locate valid PlayerCharacter files
		File[] validFiles = filePath.listFiles(new FileFilter(){
			public boolean accept(File pathname) {
				if(pathname.getName().contains("PlayerCharacter")){
					return true;
				}else{
					return false;
				}
			}
		});
		if(validFiles == null){//ensure there are actually valid files before attemping to get their names
			characterList = new String[1];
			characterList[0] = "No characters located";
		}else{
			characterList = new String[validFiles.length];
			for(int i =0; i < validFiles.length; i++){
				characterList[i] = validFiles[i].getName();
			}
		}
		actionPerformed(null);//the action has been performed. Call the method that will run the follow up on the process
	}
	
	public String[] getArray(){
		return characterList;
	}

	@Override
	public void actionPerformed(ActionEvent e) {//now that the loading is finished, notify the listeners
		for(int i = 0; i < listeners.size(); i++){
			listeners.get(i).propertyChange(new PropertyChangeEvent(this, "loadingFinished", null, null));
		}
	}
	
	ArrayList<PropertyChangeListener> listeners = new ArrayList<PropertyChangeListener>();
	
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		listeners.add(listener);
	}
	
	public Object getValue(String key) {
		return null;
	}
	
	public boolean isEnabled() {
		return false;
	}
	
	public void putValue(String key, Object value) {
	}
	
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		listeners.remove(listener);
	}
	
	public void setEnabled(boolean b) {
	}
	
}
