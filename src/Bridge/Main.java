package Bridge;

public class Main {

	public static void main(String[] args) {
		
		IDevice o = new Oven();
		IDevice wm = new WashingMachine();
		ButtonSwitch bSwitch = new ButtonSwitch(o);
		
		
		bSwitch.on();
		bSwitch.off();
		bSwitch.setDevice(wm);
		bSwitch.on();
		bSwitch.off();
		
	}
	
}
