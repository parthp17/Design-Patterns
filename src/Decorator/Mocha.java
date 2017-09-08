package Decorator;

public class Mocha extends Beverage{

	private static final int PRICE = 6;
	@Override
	public String getDesc()
	{
		return "Mocha:" + PRICE ;
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return PRICE;
	}
	
}
