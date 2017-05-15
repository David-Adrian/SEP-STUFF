package Client;

public class Message {

	private int msgID;
	private String msgText;
	private Date msgDate;

	public Message(int msgID, String msgText, Date date) {

		this.msgID = msgID;
		this.msgText = msgText;
		this.msgDate = date;

	}

	public int getId() {

		return msgID;

	}

	public void setId(int ID) {

		msgID = ID;

	}

	public String getText() {

		return msgText;

	}

	public int getMessageLenght() {

		return msgText.length();

	}

	public Date getDateAndTime() {

		return msgDate;

	}

}
