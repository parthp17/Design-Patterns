package Memento;

public class CareTaker {

	Object obj;
	
	public void savePosition(PositionOriginator position){
		obj = position.save();
	}
	
	public void restorePosition(PositionOriginator position){
		position.undoToLastSave(obj);
	}
}
