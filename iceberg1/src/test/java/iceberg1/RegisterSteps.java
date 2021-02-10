package iceberg1;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterSteps {

	RegisterPageModel registerPageModel = new RegisterPageModel(); 
	
@Given("^Потребителя отваря екрана за регистрация$")
public void openRegisterScreen() throws Throwable {
	registerPageModel.navigateToRegisterPage();
}

@When("^Въведе потребителско име \"([^\"]*)\"$")
public void addUsername(String username) throws Throwable {
	registerPageModel.setUsername(username);
}

@When("^Въведе парола \"([^\"]*)\"$")
public void addPassword(String password) throws Throwable {
	registerPageModel.setPassword(password);
}

@When("^Въведе паролата повторно \"([^\"]*)\"$")
public void addPasswordSecondTime(String password2) throws Throwable {
	registerPageModel.setPassword2(password2);
}

@When("^Въведе електронна поща \"([^\"]*)\"$")
public void addEmail(String email) throws Throwable {
	registerPageModel.setEmail(email);
}

@When("^Натиска бутона за регистрация$")
public void clickRegisterButton() throws Throwable {
	registerPageModel.clickRegisterButton();
}

@Then("^Вижда съобщение \"([^\"]*)\"$")
public void checkRegisterMessage(String exeptedMessage) throws Throwable {
    assertEquals(exeptedMessage, registerPageModel.getRegisterMessage());
}




}
