package Interpreter;

public interface IExpressionInterpreter {

	String evaluate(int val);
}

class BinaryExpressionInterpreter implements IExpressionInterpreter{

	@Override
	public String evaluate(int val) {
		return Integer.toBinaryString(val);
	}
}

class HexExpressionInterpreter implements IExpressionInterpreter{
	
	@Override
	public String evaluate(int val){
		return Integer.toHexString(val);
	}
}