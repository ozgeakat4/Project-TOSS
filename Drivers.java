package projectTossI;

import java.io.IOException;

import org.json.simple.parser.ParseException;

interface Drivers {
	void  readConfig() throws IOException, ParseException;
	void setupDriver();


}
