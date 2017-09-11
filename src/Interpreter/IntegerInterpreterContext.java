package Interpreter;

public class IntegerInterpreterContext {

	IExpressionInterpreter interpreter;
	int val;
	
	public IntegerInterpreterContext(IExpressionInterpreter interpreter, int val) {
		super();
		this.interpreter = interpreter;
		this.val = val;
	}
	public IExpressionInterpreter getInterpreter() {
		return interpreter;
	}
	public void setInterpreter(IExpressionInterpreter interpreter) {
		this.interpreter = interpreter;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	
	public String interpret(){
		return this.interpreter.evaluate(this.val);
	}
	
}
