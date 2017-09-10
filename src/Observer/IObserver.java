package Observer;

public interface IObserver {
	void updates(String message);
}

class Member implements IObserver{

	private ChatRoom chatRoom;
	public ChatRoom getChatRoom() {
		return chatRoom;
	}

	public void setChatRoom(ChatRoom chatRoom) {
		this.chatRoom = chatRoom;
	}

	private StringBuilder myDisplay;
	
	Member(ChatRoom chatRoom)
	{
		this.chatRoom = chatRoom;
		myDisplay = new StringBuilder();
	}
	
	@Override
	public void updates(String message) {
		myDisplay.append(message);
		System.out.println("My id " +this + " "+ myDisplay.toString());
	}
	
	public void sendMessage(String message){
		chatRoom.post(message);
	}
	
}
