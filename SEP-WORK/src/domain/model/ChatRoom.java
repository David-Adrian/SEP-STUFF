package domain.model;

import java.util.ArrayList;

/**
 * Created by romietis on 5/15/17.
 */
public class ChatRoom {

    private String name;
    private ArrayList<Message> messages;

    public ChatRoom(String name){
        this.name = name;
        messages = new ArrayList<>();
    }
    
    public String getChatRoomName(){
        return name;
    }

    public void addMessage(Message msg){
        messages.add(msg);
    }

    public String toString(){
        String s = "";
        for (Message message : messages){
            s += message + "\n";
        }
        return s;
    }
}
