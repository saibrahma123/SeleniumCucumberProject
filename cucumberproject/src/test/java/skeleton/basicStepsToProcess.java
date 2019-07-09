package skeleton;

import org.junit.Assert;

//import org.junit.Assert;

import Person.Person;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class basicStepsToProcess 
{
	
	Person shaun = new Person();
	@Given("Shaun is {int} meters away from Lucia")
	public void shaun_is_meters_away_from_Lucia(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		shaun.setDistance(int1);
		
	}

	@When("Shaun shouts {string}")
	public void shaun_shouts(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		shaun.setMessage(string);
	}

	@Then("Lucia (listens|cannot listen) to the message")
	public void lucia_listens_to_the_message() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String message = shaun.getMessage();
		Assert.assertEquals("Free Coffee", message);
	}
	

}
