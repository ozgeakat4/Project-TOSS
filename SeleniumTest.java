package projectTossI;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;


import io.cucumber.cienvironment.internal.com.eclipsesource.json.ParseException;

public class SeleniumTest extends AbstractTest{

	
	public static WebDrivers driver; 
	//public static JSONObject gg;
	public SeleniumTest() throws IOException, ParseException, org.json.simple.parser.ParseException  {
		super(new WebDrivers());
		this.driver = (WebDrivers) super.driverObj;
		// TODO Auto-generated constructor stub
		

	}

	@Override
	void runTest() {
		// TODO Auto-generated method stub

		
	}
	
	void clicks() {
		// TODO Auto-generated method stub
		String button= ((String)driver.driverConfiguration.get("loginWeb"));//burası önemli
		driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
		driver.driver.findElement(By.id(button)).click(); // burasıda
		//System.out.println(driver.driverConfiguration.get("loginWeb")); 
	}
	
	
	/*
	 * public static void click() throws IOException,
	 * org.json.simple.parser.ParseException { JSONParser parser = new JSONParser();
	 * try { FileReader reader =new FileReader(
	 * "/Users/ozgeakat/eclipse-workspace/projectTossI/src/test/resources/config.json"
	 * ); gg = (JSONObject) parser.parse(reader);
	 * 
	 * } catch (FileNotFoundException e) { e.printStackTrace(); }
	 * System.out.println(gg.get("loginWeb"));
	 * 
	 * }
	 */
	

}
