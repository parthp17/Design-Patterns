package Iterator;

import java.util.ArrayList;
import java.util.List;

public class Refrigerator implements IStorage{

	List<Drink> drinks;
	
	public Refrigerator() {
		this.drinks = new ArrayList<>();
	}
	
	public boolean addDrink(Drink drink){
		return drinks.add(drink);
	}
	
	@Override
	public Iterator<Drink> createIterator() {
		return new DrinkIterator();
	}
	
	class DrinkIterator implements Iterator<Drink>{

		int index = 0;
		@Override
		public boolean hasNext() {
			if(index >= drinks.size() || drinks.get(index) == null)
				return false;
			return true;
		}
		
		@Override
		public Drink Next() {
			return drinks.get(index++);
		}
	}

}
