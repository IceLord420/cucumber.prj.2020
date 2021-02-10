package iceberg1;

public class RegisterPageModel {

	private String username;
	private String password;
	private String password2;
	private String email;
	private Object registerMessage;
	public void navigateToRegisterPage() {
		System.out.println("Навигирането до регистрацията на системата е успешно");	
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void clickRegisterButton() {
		registerMessage = RegisterService.register(username, password, password2, email);
	}

	public Object getRegisterMessage() {
		return registerMessage;
	}

	
	
}
