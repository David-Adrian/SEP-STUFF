package Client;

import java.util.ArrayList;

public class Chatroom {

	private String name;
	private UserList users;
	private Message message;

	public Chatroom(String name, UserList users, Message message) {

		this.name = name;
		this.users = users;
		this.message = message;
		
	}

	public String getName() {

		return name;

	}
	
	public Message getMessage(){
		
		return message;
		
	}
	
	public 	UserList getUsers(){
		
		return users;
		
	}

	public int countActiveUsers() {

		int count = 0;

		for (int i = 0; i < users.listSize(); i++) {
			if (users.getUser(i).getStatus() == true) {
				count++;
			}
		}

		return count;

	}
}
