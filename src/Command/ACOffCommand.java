package Command;

public class ACOffCommand implements ICommand{

	AC ac;
	public ACOffCommand(AC ac) {
		this.ac = ac;
	}
	
	@Override
	public void execute() {
		ac.off();
	}
	@Override
	public void unexecute() {
		ac.on();
	}
}
