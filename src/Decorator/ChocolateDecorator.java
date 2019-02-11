package Decorator;

public class ChocolateDecorator extends BeverageDecorator{

	private static final int PRICE = 2; 
	public ChocolateDecorator(Beverage beverage) {
		super(beverage);
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return getBeverage().getCost() + PRICE;
	}
	
	@Override
	public String getDesc() {
		return getBeverage().getDesc() + " Chocolate:" + PRICE;
	}
	
	

}
