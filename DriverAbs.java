package projectTossI;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class DriverAbs implements Drivers {
	protected JSONObject driverConfiguration;
	protected Object driver;

	
	@Override
	public void readConfig() throws IOException, ParseException {
		JSONParser parser = new JSONParser();
		try {
			FileReader reader =new FileReader("/Users/ozgeakat/eclipse-workspace/projectTossI/src/test/resources/config.json");
			this.driverConfiguration = (JSONObject) parser.parse(reader);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	

	@Override
	public void setupDriver() {
	
	}

	
	

}
