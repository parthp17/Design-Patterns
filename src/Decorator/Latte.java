package Decorator;

public class Latte extends Beverage{

	private static final int PRICE = 5;
	@Override
	public String getDesc()
	{
		return "Latte:"+ PRICE;
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return PRICE;
	}

}
