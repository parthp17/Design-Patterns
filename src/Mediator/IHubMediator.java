package Mediator;

import java.util.ArrayList;
import java.util.List;

public interface IHubMediator {

	void sendMessage(String message, Device device);
	
	void addDevice(Device device);
}

class Hub implements IHubMediator{

	List<Device> devices;
	
	Hub()
	{
		this.devices = new ArrayList<>();
	}
	
	@Override
	public void sendMessage(String message, Device sender) {
		devices.stream().filter(t -> t != sender).forEach(t -> t.recievePacket(message));
	}

	@Override
	public void addDevice(Device device) {
		this.devices.add(device);
		
	}
	
	
}