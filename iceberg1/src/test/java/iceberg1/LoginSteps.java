package iceberg1;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	LoginPageModel loginPageModel = new LoginPageModel();
	
@Given("^Потребителят отваря екрана за вход в системата$")
public void openLoginScreen() throws Throwable {
    loginPageModel.navigateToLoginScreen();
}

@When("^Въвежда потребителско име \"([^\"]*)\"$")
public void addUsername(String username) throws Throwable {
	loginPageModel.setUsername(username);
}

@When("^Въвежда паролата \"([^\"]*)\"$")
public void addPassword(String password) throws Throwable {
	loginPageModel.setPassword(password);
}

@When("^Натиска бутона за вход в системата$")
public void clickLoginButton() throws Throwable {
   loginPageModel.clickLoginButton();
}

@Then("^Вижда съобщение за \"([^\"]*)\"\\.$")
public void checkLoginMessage(String expectedMessage) throws Throwable {
   assertEquals(expectedMessage, loginPageModel.getLoginMessage());
}


}
