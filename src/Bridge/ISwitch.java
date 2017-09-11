package Bridge;

public interface ISwitch {
	void on();
	void off();
}


class ButtonSwitch implements ISwitch{

	IDevice device;
	public ButtonSwitch(IDevice device) {
		this.device = device;
	}
	
	@Override
	public void on() {
		this.device.start();
	}

	public IDevice getDevice() {
		return device;
	}

	public void setDevice(IDevice device) {
		this.device = device;
	}

	@Override
	public void off() {
		this.device.stop();	
	}
}