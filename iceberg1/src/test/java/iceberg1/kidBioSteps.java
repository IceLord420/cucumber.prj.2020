package iceberg1;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class kidBioSteps {
	
	KidBioPageModel kidBioPageModel = new KidBioPageModel(); 

@Given("^Потребителят отваря екрана за информация на своето дете$")
public void openKidBioScreen() throws Throwable {
	kidBioPageModel.navigateToKidBioPage();
}

@When("^Въвежда име на детето \"([^\"]*)\"$")
public void setKidName(String name) throws Throwable {
	kidBioPageModel.setName(name);
}

@When("^Въвежда възраст на детето\"([^\"]*)\"$")
public void setAge(String age) throws Throwable {
	kidBioPageModel.setAge(age);
}

@When("^Въвежда дали има заболавания на детето \"([^\"]*)\"$")
public void setDisability(Boolean disable) throws Throwable {
	kidBioPageModel.setDisability(disable);
}

@When("^Въвежда дали детето има близнак\"([^\"]*)\"$")
public void setTwins(Boolean twin) throws Throwable {
	kidBioPageModel.setTwins(twin);
}

@When("^Въвежда дали детето има брат/сестра \"([^\"]*)\"$")
public void setSublings(Boolean subling) throws Throwable {
	kidBioPageModel.setSublings(subling);
}

@When("^Натиска бутона за въвеждате$")
public void clickEnterKidBioButton() throws Throwable {
	kidBioPageModel.clickRegisterButton();
}

@Then("^Вижда съобщение  \"([^\"]*)\"$")
public void checkBioMessage(String exeptedMessage) throws Throwable {
	assertEquals(exeptedMessage, kidBioPageModel.getKidBioMessage());
}

}
