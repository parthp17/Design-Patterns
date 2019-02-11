package Decorator;

public class VanillaDecorator extends BeverageDecorator{

	private static final int PRICE = 1;
	public VanillaDecorator(Beverage beverage) {
		super(beverage);
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return getBeverage().getCost() + PRICE;
	}
	
	@Override
	public String getDesc() {
		return getBeverage().getDesc() + " Vanilla:" + PRICE;
	}

}
