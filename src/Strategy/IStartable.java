package Strategy;

public interface IStartable {

	public void start();	
}


class QuickStart implements IStartable{

	@Override
	public void start() {
		
		System.out.println("Quick Starting ...");
		
	}
	
}

class NormalStart implements IStartable{

	@Override
	public void start() {
		
		System.out.println("Normal Start ...");
	}
}

class DeferredStart implements IStartable{
	
	@Override
	public void start() {
		
		System.out.println("Deferred start ...");
		
	}
}