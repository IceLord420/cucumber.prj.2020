package iceberg1;

import java.util.ArrayList;
import java.util.List;

public class RegisterService {

	public static String register(String username, String password, String password2
			, String email) {
		

		if(null == username || "".equals(username)) 
		{ 
			return "Въведете име"; 
		}
		
		if(null == email || "".equals(email))
		{ 
			return "Въведете Email"; 
		}
		
		if(password == null || "".equals(password) || password2 == null || "".equals(password2)) 
		{
			return "Въведете парола";
		}
		
		final Login newUser = new Login(username, password, email);
		List<Login> users = getUsers();		
		users.add(newUser);
		
		return users.contains(newUser) ? "Успешна регистрация" : "";
	}
	
	private static List<Login> getUsers(){
		
		final List<Login> result = new ArrayList<>();
		return result;
	}

}
