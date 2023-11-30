package projectTossI;


import io.cucumber.cienvironment.internal.com.eclipsesource.json.ParseException;
import io.cucumber.java.en.Given;
import java.io.IOException;

public class StepDefinition {
	//public WebDriver driver = new ChromeDriver(); 
	public AppiumTest DriverA;
	public SeleniumTest WebTest;


	@Given("open google")
	public void open_google() throws ParseException, IOException, org.json.simple.parser.ParseException {
		WebTest = new SeleniumTest();
		WebTest.clicks();
	
	    
	}
	@Given("open youtube")
	public void open_youtube() throws ParseException, IOException, org.json.simple.parser.ParseException {
	    // Write code here that turns the phrase above into concrete actions
		DriverA = new AppiumTest();
		System.out.println("alooo2");
		DriverA.clicks();
		
		
	}


}

