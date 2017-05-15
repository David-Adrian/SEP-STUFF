package Client;

import java.util.ArrayList;

public class ChatroomList {

	private Chatroom room;
	private ArrayList<Chatroom> Chatrooms;

	public ChatroomList() {

		Chatrooms = new ArrayList<Chatroom>();

	}

	public void addChatroom(Chatroom chat) {

		Chatrooms.add(chat);

	}

	public Chatroom getChatroom(Chatroom chat) {

		Chatroom temp = null;

		for (int i = 0; i < Chatrooms.size(); i++) {
			if (Chatrooms.get(i) == chat) {

				temp = chat;

			} else
				System.out.println("Chatroom doesnt exist.");
		}
		return temp;
	}

	public void deleteChatroom(Chatroom chat) {

		Chatrooms.remove(chat);

	}

	public void deleteAllChatrooms() {

		Chatrooms.removeAll(Chatrooms);

	}
}
