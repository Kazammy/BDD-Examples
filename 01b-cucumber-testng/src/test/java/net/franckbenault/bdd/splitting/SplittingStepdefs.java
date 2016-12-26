package net.franckbenault.bdd.splitting;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertEquals;

public class SplittingStepdefs {

	private String fullName;
	private FirstLastName firstLastName;
	
    @Given("^the full name (.+)$")
    public void given_the_full_name(String fullName) {
       this.fullName = fullName;
    }
    
    @When("^this full name is broken$") 
	public void when_the_full_name_is_broken() {
    	firstLastName = Splitter.split(fullName);	 
    }
    
    @Then("the first name is (.+)$")
    public void then_first_name_is(String firstName) {
    	assertEquals(firstLastName.getFirstName(), firstName);
    }
    
    @Then("the last name is (.+)$")
    public void then_last_name_is(String lastName) {
    	if(lastName.equals("(null)"))
    		lastName=null;
    	
    	assertEquals(firstLastName.getLastName(), lastName);
    }
}
