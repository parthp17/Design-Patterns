package Observer;

public class ChatRoom extends Subject{

	private StringBuilder board;
	
	public ChatRoom() {
		super();
		board = new StringBuilder();
	}
	@Override
	void add(IObserver observer) {
		getList().add(observer);
	}

	@Override
	void remove(IObserver observer) {
		getList().remove(observer);
		
	}

	@Override
	void doNotify(String update) {
		getList().forEach(o -> o.updates(update)); 
	}
	
	public String getBoard() {
		return board.toString();
	}
	
	public void post(String s){
		board.append(s);
		doNotify(s);
	}

}
