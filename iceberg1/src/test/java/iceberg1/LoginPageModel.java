package iceberg1;

public class LoginPageModel {

	private String username;
	private String password;
	String message;

	public void navigateToLoginScreen() {
		System.out.println("Навигирането до входа на системата е успешно");		
	}

	public void setUsername(String username) {
		this.username = username;
		
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void clickLoginButton() {
		message = LoginService.login(username, password);
	}

	public String getLoginMessage() {
		return message;
	}

}
