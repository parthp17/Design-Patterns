package Visitor;

public interface IVisitableElement {
	double accept(IVisitor visitor);
}


class Neccesity implements IVisitableElement{

	private double price;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public double accept(IVisitor visitor) {
		visitor.visit(this);
		return 0;
	}
}

class Liqour implements IVisitableElement{

	private double price;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public double accept(IVisitor visitor) {
		visitor.visit(this);
		return 0;
	}
	
}

class Tobacco implements IVisitableElement{

	private double price;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public double accept(IVisitor visitor) {
		visitor.visit(this);
		return 0;
	}
	
	
}