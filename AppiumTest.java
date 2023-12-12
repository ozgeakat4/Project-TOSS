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
	void clicks(String buton) {
		// TODO Auto-generated method stub
		buton= ((String)drivers.driverConfiguration.get(buton));//burası önemli
		drivers.drivers.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
		drivers.drivers.findElement(By.id(buton)).click(); 
		 
	}
	void type(String input,String buton) {
		drivers.drivers.findElement(By.id(buton)).sendKeys(input); 
	}

}
