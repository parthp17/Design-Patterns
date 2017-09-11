package Memento;

import javax.swing.text.Position;

public class CareTaker {

	Object obj;
	
	public void savePosition(PositionOriginator position){
		obj = position.save();
	}
	
	public void restorePosition(PositionOriginator position){
		position.undoToLastSave(obj);
	}
}
