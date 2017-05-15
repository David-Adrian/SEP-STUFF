package Client;

import java.util.ArrayList;

public class UserList {

	private User user;
	private ArrayList<User> Users;

	public UserList() {

		Users = new ArrayList<User>();

	}

	public void addUser(User userz) {

		Users.add(userz);

	}

	public void deleteUser(User userz) {

		Users.remove(userz);

	}

	public void deleteAllUsers() {

		Users.removeAll(Users);

	}

	public int listSize() {

		return Users.size();

	}

	public User getUser(int i) {

		User index = null;

		for (i = 0; i < Users.size(); i++) {
			index = Users.get(i);
		}

		return index;

	}

	public boolean existUser(User userz) {

		User index = null;

		for (int i = 0; i < Users.size(); i++) {
			if(Users.get(i) == userz){
				return true;
			}
		}
		return false;
	}
}
