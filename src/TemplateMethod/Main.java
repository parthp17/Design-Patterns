package TemplateMethod;

public class Main {

	public static void main(String[] args) {
		
		Pizza cheeseyPizza = new CheesePizza();
		Pizza meatyPizza = new MeatPizza();
		Pizza veggiePizza = new VegPizza();
		cheeseyPizza.buildPizza();
		System.out.println("***************************************************");
		meatyPizza.buildPizza();
		System.out.println("***************************************************");
		veggiePizza.buildPizza();
		
	}
}
