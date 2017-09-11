package Mediator;

public abstract class Device {

	private IHubMediator hub;
	private String name;
	Device(IHubMediator hub, String name){
		this.hub = hub;
		this.name = name;
	}
	
	public IHubMediator getHub() {
		return hub;
	}

	public String getName() {
		return name;
	}

	public abstract void sendPacket(String packet);
	public abstract void recievePacket(String packet);
	
}

class Laptop extends Device{

	Laptop(IHubMediator hub, String name) {
		super(hub, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendPacket(String packet) {
		getHub().sendMessage(packet, this);
	}

	@Override
	public void recievePacket(String packet) {
		System.out.println("Device: "+ this.getName() + " Message recieved "+ packet);
	}
	
}