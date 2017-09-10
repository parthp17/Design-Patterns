package FlyWeight;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Square {

	String color;
	int side;
	int[][] area;

	Square(String color, int side) {
		this.color = color;
		this.side = side;
		area = new int[side][side];
	}

	public void setColor(String color) {
		this.color = color;
	}
}

class SquareFactory {

	Map<Integer, Square> map = new HashMap<>();

	Square draw(String color, int side) {
		Square sq = null;
		if (map.containsKey(side)) {
			sq = map.get(side);
			sq.setColor(color);
		} else {
			sq = new Square(color, side);
			Arrays.stream(sq.area).forEach(t -> Arrays.fill(t, -1));
			map.put(side, sq);
		}
		/*sq = new Square(color, side);
		Arrays.stream(sq.area).forEach(t -> Arrays.fill(t, -1));
		map.put(side, sq);*/
		return sq;
	}

}

class Main {

	public static void main(String[] args) {

		SquareFactory sf = new SquareFactory();
		long start = System.currentTimeMillis();
		long end;
		for (int i = 0; i < 100000; i++) {
			int side = (int) (Math.random() * 10);
			int icolor = (int) (Math.random() * 10) - 5;

			switch (icolor) {

			case 0: {
					sf.draw("white", side);
					break;
			}
			case 1: {
				sf.draw("red", side);
				break;
			}
			case 2:{
				sf.draw("green", side);
				break;
			}
			case 3:{
				sf.draw("blue", side);
				break;
			}
			case 4:{
				sf.draw("orange", side);
				break;
			}
			default:{
				sf.draw("black", side);
				break;
			}
			
			}

		}
		end = System.currentTimeMillis();
		System.out.println(end-start);

	}
}