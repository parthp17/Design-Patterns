package Iterator;

public class FoodRack implements IStorage{

	Food[] food = null;
	int curSize = 0;
	public FoodRack(int size) {
		food = new Food[size];
	}
	
	public boolean addFood(Food food){
		if(curSize >= this.food.length || food == null) return false;
		this.food[curSize++] = food;
		return true;
	}
	
	@Override
	public Iterator<Food> createIterator() {
		return new FoodIterator();
	}
	
	public class FoodIterator implements Iterator<Food>{
		int index = 0;
		@Override
		public boolean hasNext() {
			if(index >= food.length || food[index] == null)
				return false;
			return true;
		}
		@Override
		public Food Next() {
			return food[index++];
		}
	}

}

