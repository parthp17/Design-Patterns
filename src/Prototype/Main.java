package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		List<Coordinate> ls = new ArrayList<>();
		ls.add(new Coordinate(0, 0));ls.add(new Coordinate(2, 2));ls.add(new Coordinate(3, 3));ls.add(new Coordinate(4, 4));
		Location l1 = new Location("alpha", ls);
		Location l2 = (Location) l1.clone();
		
		System.out.println(l1.toString() );
		System.out.println(l2.toString() ) ;
	}
}
