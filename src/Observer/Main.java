package Observer;

public class Main {

	
	public static void main(String[] args) {
		
		ChatRoom room= new ChatRoom();
		Member client1 = new Member(room);
		Member client2 = new Member(room);
		room.add(client1);
		room.add(client2);
		
		client1.sendMessage("Hi Client 2..");
		client2.sendMessage("Hi Client 1!");
		
		client1.getChatRoom().remove(client1);
		client2.sendMessage("wssup");
	}
}
