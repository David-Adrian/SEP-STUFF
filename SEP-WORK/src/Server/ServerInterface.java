package Server;

import Client.Chatroom;
import Client.Date;
import Client.User;

public interface ServerInterface {

	public String getMessages();
	public Date getMessageDate();
	public User getUser();
	public Chatroom getChatroom();
	public String addMessage();
	
	
}
