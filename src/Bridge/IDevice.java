package Bridge;

public interface IDevice {

	void start();
	void stop();
}

class Oven implements IDevice{
	@Override
	public void start() {
		System.out.println("Starting Oven");
	}

	@Override
	public void stop() {
		System.out.println("Stoping Oven");	
	}
}

class WashingMachine implements IDevice{
	@Override
	public void start() {
		System.out.println("Starting washing machine...");
	}
	
	@Override
	public void stop() {
		System.out.println("Stoping washing machine...");
	}
}