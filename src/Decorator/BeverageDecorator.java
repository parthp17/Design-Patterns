package Decorator;

public abstract class BeverageDecorator extends Beverage{

	private  Beverage beverage;

	BeverageDecorator(Beverage beverage){ this.beverage = beverage;}

	public Beverage getBeverage() {
		return beverage;
	}
}
