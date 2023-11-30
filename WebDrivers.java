package projectTossI;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class WebDrivers extends DriverAbs{
	
	public WebDriver driver ;
	
	public void setupDriver() {
	driver = new ChromeDriver(); 
	driver.get((String) driverConfiguration.get("url"));// burası önemli
	driver.manage().window().maximize();
	//driver.findElement(By.id((String) driverConfiguration.get("loginWeb")));
	
	
	}

}
