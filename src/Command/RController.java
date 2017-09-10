package Command;

import java.util.Stack;

public class RController {

	private ICommand lightOffCommand;
	private ICommand lightOnCommand;
	private ICommand acOffCommand;
	private ICommand acOnCommand;
	private Stack<ICommand> undoStack;
	public RController(ICommand loff, ICommand lon, ICommand aoff, ICommand aon) {
		lightOffCommand = loff;
		lightOnCommand = lon;
		acOffCommand = aoff;
		acOnCommand = aon;
		undoStack = new Stack<>();
	}
	
	public void lightOn(){
		this.lightOnCommand.execute();
		undoStack.push(lightOnCommand);
	}
	
	public void lightOff(){
		this.lightOffCommand.execute();
		undoStack.push(lightOffCommand);
	}
	public void acOn(){
		this.acOnCommand.execute();
		undoStack.push(acOnCommand);
	}
	public void acOff(){
		this.acOffCommand.execute();
		undoStack.push(acOffCommand);
	}
	
	public void undoAction()
	{
		if(!undoStack.isEmpty())
			undoStack.pop().unexecute();
	}
}
