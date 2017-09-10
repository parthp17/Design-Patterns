package Command;

public class LightOnCommand implements ICommand{

	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		this.light.on();
	}

	@Override
	public void unexecute() {
		this.light.off();
	}

}
