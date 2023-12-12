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
	
	void clicks(String buton) {
		// TODO Auto-generated method stub
		buton= ((String)driver.driverConfiguration.get(buton));
		driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
		driver.driver.findElement(By.id(buton)).click(); 
	}
	void type(String input,String buton) {
		
		driver.driver.findElement(By.id(buton)).sendKeys(input); 
	}
	
	
	

}
