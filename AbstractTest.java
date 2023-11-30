package projectTossI;

import java.io.IOException;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.ParseException;

public abstract class AbstractTest {
	protected Drivers driverObj;
	public AbstractTest(Drivers driver) throws IOException, ParseException, org.json.simple.parser.ParseException {
		driver.readConfig();
		driver.setupDriver();
		this.driverObj = driver;
	}
	
	abstract void runTest();
	abstract void clicks();
	
}
