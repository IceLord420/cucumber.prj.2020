package iceberg1;

import java.util.ArrayList;
import java.util.List;

public class LoginService {

	public static String login(String username, String password) {
		List<Login> users = getUsers();
		final boolean userExist = users.stream().
				anyMatch(user -> user.getUsername().equals(username)
				&& user.getPassword().equals(password));
				
		return userExist ? "OK" : "Error";
	}
	
	private static List<Login> getUsers(){
		Login user = new Login();
		user.setUsername("Ivan");
		user.setPassword("123");
		final List<Login> result = new ArrayList<>();
		result.add(user);
		return result;
	}
	

}
