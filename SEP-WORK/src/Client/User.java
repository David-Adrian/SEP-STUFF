package Client;

public class User {

	private String username;
	private boolean isOnline;
	private String password;

	public User(String username, String password) {

		this.username = username;
		this.password = password;
		isOnline = false;

	}

	public boolean getStatus() {

		return isOnline;

	}

	public void LogIN() {

		isOnline = true;

	}

	public void LogOFF() {

		isOnline = false;

	}

	public String getUsername() {

		return username;

	}

	public String getPassword() {

		return password;

	}

	public void SetUsername(String name) {

		username = name;

	}

	public void SetPassword(String pass) {

		password = pass;

	}

	public int totalMessagesSent() {

		//thinking that making a message list class where in an arraylist we can 
		//count the messages
		return 0;

	}

}
