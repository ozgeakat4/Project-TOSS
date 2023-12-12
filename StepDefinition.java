package projectTossI;


import io.cucumber.cienvironment.internal.com.eclipsesource.json.ParseException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class StepDefinition {
	//public WebDriver driver = new ChromeDriver(); 
	public AppiumTest DriverA;
	public SeleniumTest WebTest;


	@Given("open web")
	public void open_web() throws ParseException, IOException, org.json.simple.parser.ParseException {
		WebTest = new SeleniumTest();
	    
	}
	
	@Given("open app")
	public void open_app() throws ParseException, IOException, org.json.simple.parser.ParseException {
	    // Write code here that turns the phrase above into concrete actions
		DriverA = new AppiumTest();
		
	}
	@Given("click web {string}")
	public void click_web(String buton) throws ParseException, IOException, org.json.simple.parser.ParseException {
			WebTest.clicks(buton);
			}

	@Given("click app {string}")
	public void click_app(String buton) throws ParseException, IOException, org.json.simple.parser.ParseException {
			DriverA.clicks(buton); 
		}

	@Then("type web {string} {string}")
	public void type_web(String input, String buton)  throws ParseException, IOException, org.json.simple.parser.ParseException {
		WebTest.type(input,buton);
	}

	@Then("type app {string} {string}")
	public void type_app(String input2,String buton)  throws ParseException, IOException, org.json.simple.parser.ParseException {
		DriverA.type(input2,buton);
	}

	@Then("the search results should contain {string}")
	public void the_search_results_should_contain(String string)  throws ParseException, IOException, org.json.simple.parser.ParseException {
		//check data
	}
		
	}
	





