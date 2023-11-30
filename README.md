# Project-TOSS

Requirement for Test Cases with Cucumber

1.To start, we need to have JDK 8 installed on our system.
2.We also need the Appium server to be installed on our system.
3.We need Android Studio if we're opening our app through an emulator. So, download Android Studio from this official link. Open the exe(Windows)/dmg(Mac) file and follow the instructions to install Android Studio.
Alternatively, we can use to connect to a real Android device.
4.We need any Java-based IDE (integrated development environment) like Eclipse or IntelliJ.we'll use Eclipse to write our test cases. 

Project Setup in IDE
1.Open Eclipse, and then click on File > New > Other.
2.Select "Maven Project" and click on the "Next" button.
3.Create a simple project" is selected. After that, click on the "Next" button.
4.Give the Group ID and Artifact ID, which should be the same
5.Update  pom.xml file to add the dependencies for the project
	-	<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
	- <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
	- <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
	- <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-chrome-driver -->
	- <!-- https://mvnrepository.com/artifact/io.appium/java-client -->

Cucumber Code in Feature File
1.Create a file called cucumber.feature (name is example)
2.the scenario will define the test. Here, the Given, When, and Then functions define the different features in the test

Writing Test Cases With Java
1. right-click on src/test/java, and then click on "New." After that, select "Class" to create a new class
2. In the next pop-up, give the test file a name. We've named it StepDefiniton.java
3. Implement functions for test cases

Automation Testing
To start our automated testing, make sure that our Android device is connected to our system.
Run the command adb devices, which will show our connected device.

The Bridge Design Pattern is used to minimize the dependency between abstractions and implementations. 
Essentially, it relies on transforming the relationship between abstraction and implementation from an "is a" relationship to a "has a" relationship with the 
goal of reducing this dependency. It is one of the structural design patterns, 
and although it may appear more structurally complex when used, 
it provides advantages such as achieving a more flexible and maintainable software.

Bridge pattern Structure:
Drivers—— interface
DriverAbs—abstract class Driver implement Drivers
WebDrivers—class extends DriverAbs
MobileDriver—class extends DriverAbs
AbstractTest—abstract class
AppiumTest—extends AbstarctTest
SeleniumTest—extends AbstarctTest 
