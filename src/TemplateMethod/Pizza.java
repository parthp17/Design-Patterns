package TemplateMethod;

public abstract class Pizza {

	public final void buildPizza()
	{
		bakeBread();
		applySacues();
		addCheese();
		addVeges();
		addMeat();
		addSpices();
		bakingPizza();
	}
	
	void bakeBread(){
		System.out.println("Baking bread!");
	}
	
	void applySacues(){
		System.out.println("Applying sauces!");
	}
	
	void addCheese(){
		System.out.println("Adding cheese!");
	}
	
	abstract void addVeges();
	abstract void addMeat();
	abstract void addSpices();
	final void bakingPizza(){
		System.out.println("Baking your pizzzzaaaaa");
	}
	
}

class VegPizza extends Pizza{

	@Override
	void addVeges() {
		System.out.println("Adding lots of veggies to veg pizza");
	}

	@Override
	void addMeat() {
		System.out.println("Not adding Meat, This is a veg pizza");
	}

	@Override
	void addSpices() {
		System.out.println("Spicing it Up!");
	}
	
}

class MeatPizza extends Pizza{
	@Override
	void addVeges() {
		System.out.println("Adding less veggies to Meat pizza");
	}

	@Override
	void addMeat() {
		System.out.println("Adding meat, This is a meat pizza");
	}

	@Override
	void addSpices() {
		System.out.println("Spicing it Up!");
	}
}

class CheesePizza extends Pizza{

	@Override
	void addVeges() {
		System.out.println("Not adding veggies");
	}

	@Override
	void addMeat() {
		System.out.println("Not adding meat");
	}

	@Override
	void addSpices() {
		System.out.println("Not adding Spices");
	}
	
	@Override
	void addCheese() {
		System.out.println("Adding all sorts of cheese! this is a cheese pizza!");
	}
}