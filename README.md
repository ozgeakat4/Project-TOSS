# Project-TOSS

## Requirement for Test Cases with Cucumber

1. To start, we need to have JDK 8 installed on our system.
2. We also need the Appium server to be installed on our system.
3. We need Android Studio if we're opening our app through an emulator. So, download Android Studio from this official link. Open the exe(Windows)/dmg(Mac) file and follow the instructions to install Android Studio.
Alternatively, we can use to connect to a real Android device.
4. We need any Java-based IDE (integrated development environment) like Eclipse or IntelliJ.we'll use Eclipse to write our test cases. 

## Project Setup in IDE
1. Open Eclipse, and then click on File > New > Other.
2. Select "Maven Project" and click on the "Next" button.
3. Create a simple project" is selected. After that, click on the "Next" button.
4. Give the Group ID and Artifact ID, which should be the same
5. Update  pom.xml file to add the dependencies for the project
- [Cucumber Java](https://mvnrepository.com/artifact/io.cucumber/cucumber-java)
- [Cucumber Junit](https://mvnrepository.com/artifact/io.cucumber/cucumber-junit)
- [Selenium Java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)
- [Selenium Chrome Driver](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-chrome-driver)
- [Java Client](https://mvnrepository.com/artifact/io.appium/java-client)

## Cucumber Code in Feature File
1. Create a file called cucumber.feature (name is example)
2. The scenario will define the test. Here, the Given, When, and Then functions define the different features in the test

## Writing Test Cases With Java
1. Right-click on src/test/java, and then click on "New." After that, select "Class" to create a new class
2. In the next pop-up, give the test file a name. We've named it StepDefiniton.java
3. Implement functions for test cases (You can use Appium Inspector and Selenium IDE to create functions easily.)

## Automation Testing
To start our automated testing, make sure that our Android device is connected to our system.
Run the command adb devices, which will show our connected device.
Upload the apk file to emulator or pyhsical device.

## Appium Inspector
1. Start the Appium server.
2. Open Appium Inspector and connect it to the Appium server.
3. Select the mobile device or emulator that you want to inspect.
4. Save dependencies
```{
  "appium:deviceName": "sdk_gphone64_arm64",
  "platformName": "Android",
  "appium:platformVersion": "14",
  "appium:appPackage": "com.google.android.youtube",
  "appium:appActivity": "com.google.android.youtube.HomeActivity" 
}
```
6. Appium Inspector displays the screen of the mobile device or emulator.
You can use Appium Inspector to click on elements, view the locators of elements, and take screenshots. You can receive code. 

## Selenium IDE
1. Install Selenium IDE, go to the Chrome web store. (https://chromewebstore.google.com/detail/selenium-ide/mooikfkahbdckldjjndioackbalphokd?pli=1)
2. Download the Selenium IDE extension.
3. Restart the web browser, and the user will see the Selenium IDE extension.
4. Click on “Create a new project” and another pop-up will appear. Mention the name of the project and create new test cases.
5. To create a new test case, simply provide the name of the test. The Selenium IDE will redirect to the dashboard where testers can start Record and Playback for the test cases.
6. A button on the top-right corner will take the QA to the target website and start recording the actions or events created while in the record mode.
7. We can export cases with selected language (Java Unit etc.)

### Bridge Pattern Structure
The Bridge Design Pattern is used to minimize the dependency between abstractions and implementations. 
Essentially, it relies on transforming the relationship between abstraction and implementation from an "is a" relationship to a "has a" relationship with the 
goal of reducing this dependency. It is one of the structural design patterns, 
and although it may appear more structurally complex when used, 
it provides advantages such as achieving a more flexible and maintainable software.

## Explanation of Our Code
### Drivers 

The Drivers interface provides the basis for creating drivers for different platforms. There are two main methods in the interface:
readConfig(): This method reads the configuration information required for the device when the application runs. Configuration information is stored in a JSON file. The method is ready to handle IOException and ParseException exceptions.
setupDriver(): This method sets up the platform and makes it ready to interact with the device.

### DriverAbs

The DriverAbs class implements the Drivers interface and contains two properties named driverConfiguration and driver.
This class has two basic methods:
readConfig(): This method reads configuration information for the device from a JSON file. The method is ready to handle IOException and ParseException exceptions that may occur during reading.
setupDriver(): This method sets up your device and makes it ready to interact with the device. What this method does depends on the type of device.

### WebDriver
This WebDrivers class is used to set up a Chrome browser driver and interact with the web application using that driver.
The WebDrivers class sets the driver by creating an instance of the ChromeDriver class and assigning it to the driver variable.
setupDriver() method initializes the driver, gets the URL of the web application from the Json file.
The ChromeDriver class is a web driver provided by the Selenium project. Selenium is an infrastructure for creating automated tests for a web application.

### MobileDriver
The MobileDriver class was derived from the DriverAbs class to create drivers for different mobile devices used in the TossI project. The class's setupDriver() method was written to set up an Appium driver for a mobile device and prepare it for interaction.
The DesiredCapabilities class is used to store the identification properties of the mobile device (e.g. device name, UDID, platform name, platform version, application package name, application activity name).
The Appium driver was written to establish the device's connection with the Appium server and prepare it for interaction. The MalformedURLException exception can occur when invalid URL is provided and this exception has been prepared to handle.
The purpose of this code is to interact with different mobile devices and create mobile device drivers.

### AbstractTest
This class is an abstract class called AbstractTest. This class defines the methods to be used by objects derived from the Drivers class.
For example, the "runTest()" method is a null method that will be overridden by classes derived from this class.
Also, the "clicks()" method is an empty method to click the button given as a parameter. This method will be overridden by classes derived from this class.
Finally, the constructor of this class takes object parameter derived from the Drivers class. This constructor assigns the object given as a parameter to the driverObj variable.
The purpose of this class is to define methods and variables that are common to classes derived from the AbstractTest class.
Users can interact between objects derived from the Drivers class and the Chrome browser driver by using classes derived from this class.
For example, the "clicks()" method can be used to interact between the object derived from the Drivers class and the Chrome browser driver. This way, users can run automated tests with the Chrome browser driver.

### AppiumTest
AppiumTest class is a class used to test Android and iOS applications through Appium. This class defines methods to be used by objects derived from the MobileDriver class.
MobileDriver class is a class used to connect to the Appium server and test Android or iOS applications. This class provides methods for finding and interacting with elements within the application and performing many application testing-related tasks.
AppiumTest class is a class that derives from the AbstractTest class and therefore includes runTest() and clicks() methods.
For example, the clicks() method is used to click the button given as a parameter. This method finds the element specified as the button identifier (for example, the ID of the "SkipApp" button) and clicks on it.


### SeleniumTest
SeleniumTest class is a class used to test web applications through Selenium. This class contains methods that define various elements (e.g. buttons, input boxes, etc.) in the web application to be tested and perform testing operations for these elements.
For example, the clicks method defined in the SeleniumTest class finds the web element that matches the given identifier (for example, the ID of a button) and clicks on this element. This method is designed to work with different browsers supported by Selenium.
Additionally, a JSON object named driverConfiguration is defined in the AbstractTest class, which is used to instantiate the SeleniumTest class. This JSON object contains identifying information (e.g. ID, name, etc.) of various elements in the web application to be tested.

### StepDefinition
This class is called "StepDefinition" and uses the AppiumTest and SeleniumTest classes. This is a class used with Cucumber to test web applications and mobile applications using Appium and Selenium.
Each method defined within the class corresponds to a test step defined by Cucumber to have a specific behavior. For example, the method matching "open web" uses methods in the SeleniumTest class to open the web application.
The names of the methods are attempted to match the test steps defined by Cucumber to describe the actions the methods perform.
The variables "DriverA" and "WebTest" defined within the class represent the appropriate SeleniumTest or AppiumTest object to use, depending on the type of application we want to test. For example, the method matching the expression "open youtube" creates a new object from the AppiumTest class using the "DriverA" variable, so that tests can be performed using methods in the AppiumTest class.

1.Drivers - interface
  - DriverAbs — abstract class Driver implement Drivers
    - WebDrivers — class extends DriverAbs
    - MobileDriver — class extends DriverAbs
  - AbstractTest — abstract class
    - AppiumTest — extends AbstractTest
    - SeleniumTest — extends AbstractTest


