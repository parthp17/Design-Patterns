package Prototype;

public class Coordinate {

	int x;
	int y;
	Coordinate(int x, int y){this.x = x; this.y = y;}
	
	@Override
	public String toString() {
		return "[ x: "+ x + ", y: " + y + "]";
	}
}
