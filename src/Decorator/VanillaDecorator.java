package Decorator;

public class VanillaDecorator extends BeverageDecorator{

	private Beverage beverage;
	private static final int PRICE = 1; 
	public VanillaDecorator(Beverage beverage) {
		this.beverage = beverage;
		// TODO Auto-generated constructor stub
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
		return beverage.getDesc() + " Vanilla:" + PRICE;
	}

}
