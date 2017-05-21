package domain.model;

import java.util.ArrayList;

/**
 * Created by romietis on 5/15/17.
 */
public class ChatRoomList {

    private ArrayList<ChatRoom> chatRooms;

    public ChatRoomList(){
        chatRooms = new ArrayList<>();
    }

    public void addChatRoom(ChatRoom chatRoom){
        chatRooms.add(chatRoom);
    }

    public ChatRoom getChatRoomByIndex(int index){
        return chatRooms.get(index);
    }

    public ChatRoom getChatRoomByName(String name){
        for(ChatRoom chatRoom : chatRooms){
            if(name.equals(chatRoom.getChatRoomName()))
                return chatRoom;
        }
        return null;
    }
    public int size(){
        return chatRooms.size();
    }
}
