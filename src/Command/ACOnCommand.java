package Command;

public class ACOnCommand implements ICommand {

	AC ac;
	
	public ACOnCommand(AC ac){
		this.ac = ac;
	}
	
	@Override
	public void execute() {
		this.ac.on();
	}

	@Override
	public void unexecute() {
		this.ac.off();
	}

}
