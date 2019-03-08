package test_cucumber.test_cucumber;

import static org.junit.Assert.assertFalse;

import java.util.List;
import java.util.Map;

import org.apache.http.util.Asserts;
import org.testng.*;

import org.testng.asserts.SoftAssert;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
import junit.framework.Assert;


public class stepdefi {
	
	@When("^This is from Background$")
	public void This_is_from_Background() throws Throwable {
	   System.out.println("This is from background");
	}
	@Before
	public void setup() {
		System.out.println("All setup is done and this will run before each scenario");

	}
	
	@After
	public void cleanup(Scenario sc) {
		
		
		if(sc.isFailed()) {
		System.out.println("the screenshot is taken on failure");
	}
		else {
			System.out.println("All cleanup is done and this will trigger after each scenario");
			
		}	
	
	}
	
	@Given("^we know what jars we need and how to create a runner class$")
	public void we_know_what_jars_we_need_and_how_to_create_a_runner_class() throws Throwable {
	    System.out.println("the dependencies we need are Cucumber-core\r\n" + 
	    		"Cucumber-java\r\n" + 
	    		"Cucumber-jvm\r\n" + 
	    		"Cucumber-junit\r\n" + 
	    		"Selenium standalone \r\n" + 
	    		"");
	}

	@When("^all the dependencies are imported$")
	public void all_the_dependencies_are_imported() throws Throwable {
	    System.out.println("All dependecies are working");
	}

	@Then("^start writing the feature file$")
	public void start_writing_the_feature_file() throws Throwable {
	 System.out.println("feature file is written");
	}

	@Then("^verify if you have learned something or not$")
	public void verify_if_you_have_learned_something_or_not() throws Throwable {
	   System.out.println("ÿes learning it");
	}
	
	
	@Given("^read hooks online$")
	public void read_hooks_online() throws Throwable {
	  System.out.println("rean it online");
	
	}

	@When("^hooks we know$")
	public void hooks_we_know() throws Throwable {
		  System.out.println("we know hooks");
	}

	@Then("^impliment hooks$")
	public void impliment_hooks() throws Throwable {
		  System.out.println("hooks implimented");
	}

	@Then("^verify hooks$")
	public void verify_hooks() throws Throwable {
		  System.out.println("working verified");
	}
	
	@Given("^test data \"([^\"]*)\" we know$")
	public void test_data_we_know(String Test_data) throws Throwable {
	    System.out.println("Test data is----->"+Test_data);
	}


	@When("^test data is loaded$")
	public void test_data_is_loaded() throws Throwable {
		System.out.println("Test data is loaded ---->");
	}

	@Then("^impliment examples$")
	public void impliment_examples() throws Throwable {
		System.out.println("Examples implimented ---->");
	}

	@Then("^verify inputs$")
	public void verify_inputs() throws Throwable {
	    System.out.println("inputs verified");
	}
	
	@Given("^Sceanrio fails$")
	public void Sceanrio_fails() throws Throwable {
	  System.out.println("try failing sceanrio");
	}

	@When("^this is where sceanrio fails$")
	public void this_is_where_sceanrio_fails() throws Throwable {
		System.out.println("this is where assert fails");
		
		
	}

	@Then("^the failure exception$")
	public void the_failure_exception() throws Throwable {
	   System.out.println("will handel it");
	}

	@Then("^verify tackle$")
	public void verify_tackle() throws Throwable {
	    System.out.println("tackeled");
	}
	@Given("^enter the username and the password$")
	public void enter_the_username_and_the_password(DataTable table) throws Throwable {
		
		List<List<String>> data = table.raw();
	    System.out.println("fetching username---->"+data.get(0).get(0)+"   fetching password---->"+data.get(0).get(1));
	    System.out.println("fetching username---->"+data.get(1).get(0)+"   fetching password---->"+data.get(1).get(1));
	
	}
	
	@Then("^the result should be fine$")
	public void the_result_should_be_fine() throws Throwable {
	   System.out.println("It worked well");
	}
	
	@Given("^enter the username and the password to login$")
	public void enter_the_username_and_the_password_to_login(DataTable data) throws Throwable {
	    List<Map<String,String>> cred=data.asMaps(String.class, String.class);
	    System.out.println("fetching username---->"+cred.get(0).get("UN")+"   fetching password---->"+cred.get(0).get("Pass"));
	    System.out.println("fetching username---->"+cred.get(1).get("UN")+"   fetching password---->"+cred.get(1).get("Pass"));
	}

	@Then("^the result are there$")
	public void the_result_are_there() throws Throwable {
	   System.out.println("datatable with asmaps is implimented");
	}
	@Given("^enter the name and the pass to login1$")
	public void enter_the_name_and_the_pass_to_login1(DataTable data) {
		for(Map<String, String> credf : data.asMaps(String.class, String.class)) {
		
	    System.out.println("fetching username---->"+credf.get("UN")+"   fetching password---->"+credf.get("Pass"));
	}}

	@Then("^the result$")
	public void the_result() throws Throwable {
	  System.out.println("go to hell");
	}

}
