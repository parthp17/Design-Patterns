package Memento;

public class PositionOriginator {

	int x;
	int y;
	
	public PositionOriginator(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void myPostion()
	{
		System.out.println("X: "+ x + "Y: "+ y);
	}
	
	public Memento save(){
		return new Memento(this.x,this.y);
	}
	
	public void undoToLastSave(Object obj){
		Memento m = (Memento)obj;
		this.x = m.x1;
		this.y = m.y1;
	}
	
	void makeHorseMove(String direction)
	{
		switch(direction){
			
			case "UpRight":{
				this.x += 1;
				this.y += 2;break;
			}
			case "UpLeft":{
				this.x += -1;
				this.y += 2;break;
			}
			case "BottomRight":{
				this.x += 1;
				this.y += -2;break;
			}
			case "BottomLeft":{
				this.x += -1;
				this.y += -2;break;
			}
			case "RightUp":{
				this.x += 2;
				this.y += 1;break;
			}
			case "LeftUp":{
				this.x += -2;
				this.y += 1;break;
			}
			case "RightBottom":{
				this.x += 2;
				this.y += -1;break;
			}
			case "LeftBottom":{
				this.x += -2;
				this.y += -1;break;
			}
		}
	}
	
	private class Memento{
		int x1;
		int y1;
		public Memento(int x1, int y1) {
			this.x1 = x1;
			this.y1= y1;
		}
	}
	
}
