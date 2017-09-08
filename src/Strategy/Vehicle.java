package Strategy;

public class Vehicle {

	private IStartable startable;
	
	public Vehicle(IStartable startable) {
		super();
		this.startable = startable;
	}
	
	public void start()
	{
		this.startable.start();
	}
	
	public void run()
	{
		System.out.println("Accelerating...");
	}
	
}
