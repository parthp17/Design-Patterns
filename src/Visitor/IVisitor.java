package Visitor;

import java.text.DecimalFormat;

public interface IVisitor {

	double visit(Liqour liqour);

	double visit(Neccesity neccesity);

	double visit(Tobacco tobacco);
}

class Discount implements IVisitor {

	DecimalFormat df;

	public Discount() {
		df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
	}

	@Override
	public double visit(Liqour liqour) {
		double price = liqour.getPrice();
		double discount = Double.parseDouble(df.format(price * 0.10));
		System.out.println("Liqour Original price " + price);
		System.out.println("Liqour discount " + discount);
		return Double.parseDouble(df.format(price - discount));

	}

	@Override
	public double visit(Neccesity neccesity) {
		double price = neccesity.getPrice();
		double discount = Double.parseDouble(df.format(price * 0.20));
		System.out.println("Necsessity Original price " + price);
		System.out.println("Necsessity discount " + discount);
		return Double.parseDouble(df.format(price - discount));
	}

	@Override
	public double visit(Tobacco tobacco) {
		double price = tobacco.getPrice();
		double discount = Double.parseDouble(df.format(price * 0.05));
		System.out.println("Tobacco Original price " + price);
		System.out.println("Tobacco discount " + discount);
		return Double.parseDouble(df.format(price - discount));
	}
}