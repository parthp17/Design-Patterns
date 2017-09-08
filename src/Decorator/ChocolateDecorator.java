package Decorator;

public class ChocolateDecorator extends BeverageDecorator{

	private Beverage beverage;
	private static final int PRICE = 2; 
	public ChocolateDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public Beverage getBeverage() {
		return beverage;
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return beverage.getCost() + PRICE;
	}
	
	@Override
	public String getDesc() {
		return beverage.getDesc() + " Chocolate:" + PRICE;
	}
	
	

}
