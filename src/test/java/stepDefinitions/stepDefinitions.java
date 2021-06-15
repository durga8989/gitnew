package stepDefinitions;

import org.junit.runner.RunWith;

//import org.junit.runner.RunWith;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.cucumber.junit.Cucumber;


//import org.junit.runner.RunWith;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
//import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinitions {


		@Given("^user is on login page$")
	    public void user_is_on_login_page() throws Throwable {
			System.out.println("printing inside GIVEN");
			System.out.println("printing again");
	        //throw new PendingException();
				
	    }
		    
	    @When("^user is login into Username as \"([^\"]*)\" & Password as \"([^\"]*)\"$")
		public void user_is_login_with_username_as_password_as(String arg1, String arg2) throws Exception {
		    // Write code here that turns the phrase above into concrete actions
		   
		
			 System.out.println(arg1);
			 System.out.println(arg2);
			 
		    }
	    @Then("^home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	    	System.out.println("printing inside THEN");
	      //  throw new PendingException();
	    }

	    @And("^Cards populated are \"([^\"]*)\"$")
	    public void cards_populated_are_something(String strArg1) throws Throwable {
	        
	    }
	    @When("^user is login with (.+) & (.+)$")
	    public void user_is_login_with_(String username, String password) throws Throwable {
	    	System.out.println(username);
	    	System.out.println(password);
	        ;
	    }
	    @Given("^validate the browser$")
	    public void validate_the_browser() throws Throwable {
	        
	    }

	    @When("^browsr is triggered$")
	    public void browsr_is_triggered() throws Throwable {
	        
	    }

	    @Then("^check if browser has started$")
	    public void check_if_browser_has_started() throws Throwable {
	        
	    }
}
