package Interpreter;

public class Main {

	public static void main(String[] args) {
		
		BinaryExpressionInterpreter bei = new BinaryExpressionInterpreter();
		HexExpressionInterpreter hei = new HexExpressionInterpreter();
		IntegerInterpreterContext iic = new IntegerInterpreterContext(bei, 894267);
		
		System.out.println(iic.getVal());
		System.out.println(iic.interpret()+"B");
		iic.setInterpreter(hei);
		System.out.println(iic.interpret()+"H");
		iic.setVal(16);
		System.out.println(iic.getVal());
		System.out.println(iic.interpret()+"H");
		iic.setInterpreter(bei);
		System.out.println(iic.interpret()+"B");
	}
}
