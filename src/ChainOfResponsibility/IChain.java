package ChainOfResponsibility;

public abstract class IChain {
	
	private IChain next;
	
	public IChain getNext() {
		return next;
	}
	void setNext(IChain next){
		this.next = next;
	}
	
	abstract void resolve(String request);
	
}

class HR extends IChain{

	@Override
	public void resolve(String request) {
		if(request.contains("recruitment") || request.contains("paperwork")){
			System.out.println("HR is looking into the request");	
		}
		else {
			System.out.println("Cannot serve your request");
		}
	}
}

class PM extends IChain{

	@Override
	void resolve(String request) {
		if(request.contains("Project") || request.contains("Product")){
			System.out.println("Project manager is looking into the request");	
		}
		else {
			System.out.println("Passing you request to " + getNext().getClass());
			getNext().resolve(request);
		}
	}	
}

class TL extends IChain{

	@Override
	void resolve(String request) {
		if(request.contains("Team") || request.contains("Module")){
			System.out.println("Team Lead is looking into the request");	
		}
		else {
			System.out.println("Passing you request to " + getNext().getClass());
			getNext().resolve(request);
		}
	}
	
}