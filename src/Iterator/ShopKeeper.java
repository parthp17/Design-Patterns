package Iterator;

public class ShopKeeper {

	Iterator<Food> foodIterator;
	Iterator<Drink> drinkIterator;
	
	public ShopKeeper(FoodRack foodRack, Refrigerator refrigerator) {
		foodIterator = foodRack.createIterator();
		drinkIterator = refrigerator.createIterator();
	}
	
	public 	void listItems(){
		System.out.println("*****************Food items*****************");
		printItems(this.foodIterator);
		System.out.println("*****************Drinks*****************");
		printItems(this.drinkIterator);
	}
	
	private void printItems(Iterator<? extends Item> iterator)
	{
		while(iterator.hasNext()) System.out.println(iterator.Next().getName());
	}
	
	
	public static void main(String[] args) {
		FoodRack fr = new FoodRack(10);
		fr.addFood(new Food("Bread"));fr.addFood(new Food("veggies"));fr.addFood(new Food("Cheese"));fr.addFood(new Food("Cookies"));
		Refrigerator rf = new Refrigerator();
		rf.addDrink(new Drink("Coke"));rf.addDrink(new Drink("Wine"));rf.addDrink(new Drink("Milk"));rf.addDrink(new Drink("Fanta"));
		ShopKeeper sk = new ShopKeeper(fr, rf);
		sk.listItems();
	}
}
