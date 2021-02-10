package iceberg1;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class pointsCheckSteps {

	PointPageModel pointPageModel = new PointPageModel(); 
	
@Given("^Админът отваря екрана за преглед на точките$")
public void openPointScreen() throws Throwable {
	pointPageModel.navigateToPointScreen();
}

@Given("^Натиска бутона за търсене$")
public void clickSearchButton() throws Throwable {
	pointPageModel.clickSearchButton();
}

@Then("^Вижда резултата \"([^\"]*)\"$")
public void checkPointMessage(String exeptedMessage) throws Throwable {
	assertEquals(exeptedMessage, pointPageModel.getPointMessage());
}

@Given("^Въвежда име за търсене на детето \"([^\"]*)\"$")
public void searchName(String name) throws Throwable {
	pointPageModel.searchName(name);
}
	
}
