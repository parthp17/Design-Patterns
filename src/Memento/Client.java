package Memento;

public class Client {

	public static void main(String[] args) {
		
		PositionOriginator position = new PositionOriginator(2, 0);
		CareTaker ct = new CareTaker();
		ct.savePosition(position);
		position.makeHorseMove("UpRight");
		position.makeHorseMove("UpLeft");
		position.makeHorseMove("UpRight");
		position.makeHorseMove("RightBottom");
		ct.savePosition(position);
		position.myPostion();
		position.makeHorseMove("RightBottom");
		position.makeHorseMove("LeftBottom");
		position.makeHorseMove("LeftUp");
		
		position.myPostion();
		ct.restorePosition(position);
		position.myPostion();
	}
	
}
