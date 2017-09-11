package Visitor;

public class Main {

	public static void main(String[] args) {
		
		Neccesity milk = new Neccesity(); milk.setPrice(3.47);
		Tobacco t = new Tobacco();t.setPrice(5.83);
		Liqour l = new Liqour();l.setPrice(8.99);
		
		Discount sale = new Discount();
		
		System.out.println("Liqour Discounted Price: " + sale.visit(l));
		System.out.println("Necessity Discounted Price: " + sale.visit(milk));
		System.out.println("Tobacco Discounted Price: " + sale.visit(t));
	}
}
