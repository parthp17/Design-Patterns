package Decorator;

public class Main {

	
	public static void main(String[] args) {
		
		Beverage b1 = new ChocolateDecorator(new VanillaDecorator(new ChocolateDecorator(new Mocha())));
		System.out.println(b1.getDesc());
		System.out.println(b1.getCost());
		Beverage b2 = new VanillaDecorator(new VanillaDecorator(new ChocolateDecorator(new Latte())));
		System.out.println(b2.getDesc());
		System.out.println(b2.getCost());
	}
}
