package ChainOfResponsibility;

public class Developer {

	public static void main(String[] args) {
		
		TL tl = new TL();
		PM pm = new PM();
		HR hr = new HR();
		pm.setNext(hr);
		tl.setNext(pm);
		
		tl.resolve("paperwork");
		
	}
}
