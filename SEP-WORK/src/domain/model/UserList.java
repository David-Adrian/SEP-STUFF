package domain.model;

import java.util.ArrayList;

/**
 * Created by romietis on 5/18/17.
 */
public class UserList {

    private ArrayList<User> userList;

    public UserList(){
        userList = new ArrayList<>();
    }

    public User getUserByIndex(int index){
        return userList.get(index);
    }

    public User getUserByUsername(String username){
        for(User user: userList){
            if(username.equals(user.getUsername())){
                return user;
            }
        }
        return null;
    }

    public void login(User user){
        userList.add(user);
    }

    public void logoff(User user){
        userList.remove(user);
    }
}
