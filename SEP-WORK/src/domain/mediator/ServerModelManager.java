package domain.mediator;

import domain.model.ChatRoom;
import domain.model.ChatRoomList;
import domain.model.User;
import domain.model.UserList;

/**
 * Created by romietis on 5/18/17.
 */
public class ServerModelManager{

    private ChatRoomList chatRoomList;
    private UserList userList;

    public ServerModelManager(){

    }

    public void addChatRoom(ChatRoom chatRoom){
        if(chatRoomList == null){
            chatRoomList = new ChatRoomList();
        }
        chatRoomList.addChatRoom(chatRoom);
    }

    public ChatRoom getChatRoomByIndex(int index){
        if(index > chatRoomList.size() || index < 0){
            throw new IllegalArgumentException();
        }
        return chatRoomList.getChatRoomByIndex(index);
    }

    public ChatRoom getChatRoomByName(String name){
       return chatRoomList.getChatRoomByName(name);
    }

    public void loginUser(User user){
        if(userList == null){
            userList = new UserList();
        }
    }

    public void logoffUser(User user){
        userList.logoff(user);
    }

}
