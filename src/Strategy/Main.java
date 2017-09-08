package Strategy;

public class Main {

	
	public static void main(String[] args) {

		Vehicle v1 = new Vehicle(new NormalStart());
		Vehicle v2 = new Vehicle(new DeferredStart());
		Vehicle v3 = new Vehicle(new QuickStart());
		v1.start();
		v2.start();
		v3.start();
	}
}
