package projectTossI;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.ParseException;

public class AppiumTest extends AbstractTest{
	
	public MobileDriver drivers; 
	public AppiumTest() throws IOException, ParseException, org.json.simple.parser.ParseException  {
		super(new MobileDriver());
		this.drivers = (MobileDriver) super.driverObj; //
		// TODO Auto-generated constructor stub
	}

	@Override
	void runTest() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void clicks() {
		// TODO Auto-generated method stub
		String button= ((String)drivers.driverConfiguration.get("skipApp"));//burası önemli
		System.out.println(button);
		drivers.drivers.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
		 drivers.drivers.findElement(By.id(button)).click(); // burasıda
		 
	}

}
