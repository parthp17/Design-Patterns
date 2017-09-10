package Command;

public class CommandPattern {

	public static void main(String[] args) {
		
		Light l = new Light();
		AC ac = new AC();
		RController rc = new RController(new LightOffCommand(l), new LightOnCommand(l), new ACOffCommand(ac), new ACOnCommand(ac));
		rc.acOff();
		rc.acOn();
		rc.acOff();
		rc.acOff();
		rc.lightOn();
		rc.lightOn();
		rc.undoAction();
		rc.lightOff();
		
	}
}
