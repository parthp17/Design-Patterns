package Iterator;

public abstract class Item {

	String name;
	public String getName() {
		return name;
	}
	public Item(String name){
		this.name = name;
	}
}

class Food extends Item{
	
	public Food(String name){
		super(name);
	}
}

class Drink extends Item{
	
	public Drink(String name){
		super(name);
	}
}