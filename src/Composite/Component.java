package Composite;

public abstract class Component {

	private int price;

	public void setPrice(int price) {
		this.price = price;
	}

	public abstract int getPrice();
}
