package State;

public abstract class State {

	public abstract void collegeState();
	
}

class Freshman extends State{
	
	@Override
	public void collegeState() {
		System.out.println("I am a Freshman");	
	}
}

class Junior extends State{

	@Override
	public void collegeState() {
		System.out.println("I am a Junior");	
	}	
}

class Sophomore extends State{
	
	@Override
	public void collegeState() {
		System.out.println("I am a Sophomore");
	}
}

class Senior extends State{
	
	@Override
	public void collegeState() {
	System.out.println("I am a senior.");	
	}
}

class Graduate extends State{
	
	@Override
	public void collegeState() {
		System.out.println("I am a graduate student.");
	}
}