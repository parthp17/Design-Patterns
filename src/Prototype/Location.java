package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Location implements Cloneable{

	String name;
	List<Coordinate> coordinates;
	
	public Location(String name, List<Coordinate> ls) {

		this.name = name;
		this.coordinates = ls;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		coordinates.forEach(c -> sb.append(c.toString()));
		return sb.toString();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<Coordinate> temp = new ArrayList<>(this.coordinates);
		return new Location(this.name, temp);
	}
	
}
