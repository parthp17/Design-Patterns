package Mediator;

public class Main {

	public static void main(String[] args) {
		
		IHubMediator hub = new Hub();
		Laptop l1 = new Laptop(hub, "l1");
		Laptop l2 = new Laptop(hub, "l2");
		Laptop l3 = new Laptop(hub, "l3");
		Laptop l4 = new Laptop(hub, "l4");
		
		hub.addDevice(l1);
		hub.addDevice(l2);
		hub.addDevice(l3);
		hub.addDevice(l4);
		
		l1.sendPacket("Wss up peeps!");
		
	}
}
